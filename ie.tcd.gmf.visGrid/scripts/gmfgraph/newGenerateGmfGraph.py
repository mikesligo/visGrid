# TODO: chance the check for connection from "if "connections" in line", which is just poor

import sys 
import re

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'''r''')
w = open(sys.argv[1]+".out",'''w''')

labels=[]
labels.append("name")
descriptorNumber = -1 ## needed for accessors
numberOfChildren = 1 ## needed for accessors
accessorList = []
compartmentList = []

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
    ## Go through labels and check if they are contained in line
    ## If they are, then keep the line
    for label in labels:
        check = re.compile('\w*[a-z0-9]%s\w*'%label,re.IGNORECASE)
        match = check.search(line,re.IGNORECASE)
        if match : return True
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
        line = r.readline() # name line
        w.write(line)
        search = re.search('name="(\w*)Figure"',line)
        if search is not None: 
            name = search.group(1)
        else:
            name = ""
        if "Connections" not in name and "Parent" not in name:
            line = r.readline() # actualfigure
            line = r.readline() # xsi:type
            line = r.readline() # name
            w.write('''\t\t\t<actualFigure
              xsi:type="gmfgraph:Rectangle"
              name="outerRect"
              outline="false"
              fill="false">''')
            w.write('\n')
            line = r.readline() # layout
            line = r.readline() # xsi flowlayout
            w.write('''\t\t\t<layout
                xsi:type="gmfgraph:BorderLayout"/>''')
            w.write('\n')
            w.write('''\t\t\t<children
                xsi:type="gmfgraph:Rectangle"
                name="innerSVG"
                outline="false">
              <layoutData
                  xsi:type="gmfgraph:BorderLayoutData"
                  vertical="true"/>
              <layout
                  xsi:type="gmfgraph:BorderLayout"/>
              <children
                  xsi:type="gmfgraph:SVGFigure"
                  name="'''+name+'''FigureSVG"
                  documentURI="file:///home/mike/src/visGrid/ie.tcd.gmf.visGrid/images/'''+name.lower()+'''.svg">
                <layoutData
                    xsi:type="gmfgraph:BorderLayoutData"
                    vertical="true"/>
                <layout
                    xsi:type="gmfgraph:BorderLayout"/>
                <minimumSize
                    dx="60"
                    dy="60"/>
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
                  xsi:type="gmfgraph:BorderLayoutData"
                  alignment="END"
                  vertical="true"/>
              <layout
                  xsi:type="gmfgraph:BorderLayout"/>''')
            w.write('\n')
            line = r.readline() # children OR /actualfigure
            while "</actualFigure>" not in line and "</descriptors" not in line:
                first = line
                line = r.readline() # xsi type
                second = line
                line = r.readline() # name
                third = line
                line = r.readline() # text
                fourth = '              text="&lt;...>">\n'
                search = re.search('name="(\w*)Figure"',third)
                if search is not None:
                    key = search.group(1)
                else:
                    key = ""
                if keepLabel(key):
                    print line
                    print "Writing label"
                    ## Write the four lines
                    w.write(first)
                    w.write(second)
                    w.write(third)
                    w.write(fourth)
                    w.write('''\t\t\t<layoutData
                    xsi:type="gmfgraph:BorderLayoutData"
                    alignment="BEGINNING"
                    vertical="true"/>
              </children>''')
                    w.write('\n')
                    ## Increment children count for child access later
                    accessor = '''accessor="//@figures.0/@descriptors.'''+str(descriptorNumber)+'''/@accessors.'''+str(numberOfChildren)+'''"/>\n'''
                    accessorList.append([re.search('''name="(\w*)Figure"''',third).group(1),name,accessor,str(descriptorNumber)])

                    numberOfChildren = numberOfChildren + 1
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
                for i in xrange(numberOfChildren):
                    figure = '\t  <accessors figure="//@figures.0/@descriptors.'+str(descriptorNumber)+'/@actualFigure/@children.1/@children.'+str(i)+'"/>\n'
                    w.write(figure)
                numberOfChildren = 0
                ## ignore all the other accessors in the read file
                while '</descriptors>' not in line:
                    line = r.readline()
                ## Print the closing brackets at the end
                w.write(line)

    else: w.write (line)
    line = r.readline()
