# TODO: chance the check for connection from "if "connections" in line", which is just poor
# TODO: There is a small error in the script, where you will need to delete one line (probably a label) from the output. It will be marked in eclipse - TODO I think this will be fixed on line 16

import sys 
import re
import shutil # to move files at the very end

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'''r''')
w = open(sys.argv[1]+".out",'''w''')

labels=[]
labels.extend(["name"])
labels.extend(["Triplex_nodeVoltage_12"]) # triplex node
labels.extend(["Triplex_meterMeasured_voltage_1","Triplex_meterMeasured_real_energy"]) # triplex meter
labels.extend(["HouseAir_temperature"]) # house

descriptorNumber = -1 ## needed for accessors
numberOfChildren = 1 ## needed for accessors
accessorList = []
compartmentList = []
labelDimension = {}

def writeLabels():
    print "Writing all allowed labels"
    for i in accessorList:
        w.write('  <labels name="'+i[0]+'" figure="'+i[1]+'Figure" '+i[2])
    w.write('</gmfgraph:Canvas>')

def writeCompartments():
    print "Writing compartments"
    last = -1
    for i in accessorList:
        if i[3] is last: continue
        last = i[3]
        w.write('''  <compartments
      name="'''+i[1]+'''Compartment"
      figure="'''+i[1]+'''Figure"
      accessor="//@figures.0/@descriptors.'''+i[3]+'''/@accessors.0"/>\n''')

def keepLabel(line):
    print line
    ## Go through labels and check if they are contained in line
    ## If they are, then keep the line
    for label in labels:
        if label.lower() in line.lower(): return True
    return False

line = r.readline()
while line.rstrip():

    if '''<labels''' in line:
        writeCompartments()
        writeLabels()
        break

    elif '''<descriptors''' in line:
        descriptorNumber=descriptorNumber+1
        w.write(line)
        if "name=" not in line: 
            line = r.readline() # name line
            w.write(line)
        search = re.search('name="(\w*)Figure"',line)
        if search is not None: 
            name = search.group(1)
        else:
            name = ""
        if "Connections" not in name and "Parent" not in name:
            line = r.readline() # actualfigure
            labelDimension[name] = 0
            w.write('''\t\t\t<actualFigure
              xsi:type="gmfgraph:Rectangle"
              name="outerRect"
              outline="false"
              fill="false">''')
            w.write('\n')
            line = r.readline() # layout
            if "xsi:type" not in line: line = r.readline() # xsi:type
            w.write('''\t\t\t<layoutData
            xsi:type="gmfgraph:XYLayoutData">
          <size
              dx="150"
              dy="120"/>
        </layoutData>
        <layout
            xsi:type="gmfgraph:XYLayout"/>''')
            w.write('\n')
            w.write('''\t\t\t<children
                xsi:type="gmfgraph:Rectangle"
                name="innerSVG"
                outline="false">
                <layoutData
              xsi:type="gmfgraph:XYLayoutData">
            <topLeft
                x="45"/>
            <size
                dx="60"
                dy="60"/>
          </layoutData>
          <layout
              xsi:type="gmfgraph:XYLayout"/>
              <children
                  xsi:type="gmfgraph:SVGFigure"
                  name="'''+name+'''FigureSVG"
                  documentURI="file:///home/mike/src/visGrid/ie.tcd.gmf.visGrid/images/'''+name.lower()+'''.svg">
                   <layoutData
                xsi:type="gmfgraph:XYLayoutData">
              <size
                  dx="60"
                  dy="60"/>
            </layoutData>
              </children>
            </children>''')
            w.write('\n')
            # handle labels
            w.write('''\t\t\t        <children
                xsi:type="gmfgraph:Rectangle"
                name="inner"
                outline="false"
                fill="false"
                lineWidth="0">
                  <layoutData
              xsi:type="gmfgraph:XYLayoutData">
            <topLeft
                y="60"/>
            <size
                dx="150"
                dy="60"/>
          </layoutData>''')
            w.write('\n')
            w.write('''            <layout xsi:type="gmfgraph:FlowLayout"/>\n''')
            line = r.readline() # children OR /actualfigure
            while "</actualFigure>" not in line and "</descriptors" not in line:
                child = line
                search = re.search('name="(\w+)Figure"',child)
                if search is not None:
                    key = search.group(1)
                else:
                    key = ""
                if keepLabel(key):
                    print "Writing label"
                    ## Write the four lines
                    w.write(child.replace("/","")) # get rid of close
                    w.write('''            <layout xsi:type="gmfgraph:FlowLayout"/>\n''')
                    w.write('          </children>\n')
                    ## Increment children count for child access later
                    accessor = '''accessor="//@figures.0/@descriptors.'''+str(descriptorNumber)+'''/@accessors.'''+str(numberOfChildren)+'''"/>\n'''
                    accessorList.append([re.search('''name="(\w*)Figure"''',child).group(1),name,accessor,str(descriptorNumber)])

                    numberOfChildren = numberOfChildren + 1
                    labelDimension[name] = labelDimension[name] + 1
                #else: print "Ignoring label..."
    
                line = r.readline() # next child

            w.write('''\t\t</children>''')
            w.write('\n')

            ## Add child access
            if '</actualFigure>' in line:
                w.write(line) # write /actualfigure
                print "Adding child access"
                w.write('''      <accessors
                          figure="//@figures.0/@descriptors.'''+str(descriptorNumber)+'/@actualFigure"/>''') # to get out rect
                w.write('\n')
                if numberOfChildren > 0:
                    for i in xrange(numberOfChildren-1):
                        figure = '\t  <accessors figure="//@figures.0/@descriptors.'+str(descriptorNumber)+'/@actualFigure/@children.1/@children.'+str(i)+'"/>\n'
                        w.write(figure)
                numberOfChildren = 1
                ## ignore all the other accessors in the read file
                while '</descriptors>' not in line:
                    line = r.readline()
                ## Print the closing brackets at the end
                w.write(line)

    else: w.write (line)
    line = r.readline()

w.close()
r.close()

# Do a second run to get the dimension for labels correct, very hacky but not many options

w = open(sys.argv[1]+".out2",'w')
r = open(sys.argv[1]+".out",'r')


line = r.readline()
while line.rstrip():
    if '<descriptors' in line:
        search = re.search('name="(\w+)Figure"',line) # get name for use in labelDimension
        if 'Connections' not in line and 'Parent' not in line:
            name = search.group(1)
            # Write for containing rect
            while 'dy=' not in line:
                w.write(line)
                line = r.readline() # Find the dx dimension value
            w.write('\t\t\tdy="'+str(60+(20*labelDimension[name]))+'" />\n')
            line = r.readline() # go to next line so we're not searching for the same val we just found

            # Find rect containing SVG dimensions and do nothing
            while 'dy=' not in line:
                w.write(line)
                line = r.readline() # Find the dx dimension value
            w.write(line)
            line = r.readline() # go to next line so we're not searching for the same val we just found

            # Find SVG dimensions and do nothing
            while 'dy=' not in line:
                w.write(line)
                line = r.readline() # Find the dx dimension value
            w.write(line)
            line = r.readline() # go to next line so we're not searching for the same val we just found

            # Write for rect containing labels
            while 'dy=' not in line:
                w.write(line)
                line = r.readline() # Find the dx dimension value
            w.write('\t\t\tdy="'+str(20*labelDimension[name])+'" />\n')

        else: w.write(line)

    else: w.write(line) 
    line = r.readline()

w.close()
r.close()
shutil.move(sys.argv[1]+'.out2',sys.argv[1]+'.out')
shutil.move(sys.argv[1]+'.out',sys.argv[1])
