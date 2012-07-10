import sys 
import re

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'r')
w = open(sys.argv[1]+".out",'w')

labels=[]
labels.append("name")
name = ""

descriptorNumber = -1 ## needed for accessors
numberOfChildren = 0 ## needed for accessors
accessorList = []

def writeLabels():
    print "Writing all allowed labels"
    for i in accessorList:
        w.write('  <labels name="'+i[0]+'" figure="'+i[1]+'" '+i[2]+'')
    w.write('</gmfgraph:Canvas>')

def keepLabel(line):
    ## Go through labels and check if they are contained in line
    ## If they are, then keep the line
    for label in labels:
        check = re.compile('"\w*[a-z0-9]%s\w*"'%label,re.IGNORECASE)
        match = check.search(line,re.IGNORECASE)
        if match : return True
    return False

line = r.readline()
while line.rstrip():
    ## Having the last instance of name is often useful
    if 'name="' in line:
        search = re.search('name="(\w*)"',line)
        name = search.group(1)

    if '<descriptors' in line:
        descriptorNumber=descriptorNumber+1

    if '<labels' in line:
        writeLabels()
        break

    ## Remove all labels not specificied in 'labels'
    if '<children' in line:
        first = line
        second = r.readline()
        third = r.readline()
        fourth = r.readline()
        if 'xsi:type="gmfgraph:Label"' in second:
            if keepLabel(third):
                print "Writing label"
                ## Write the four lines
                w.write(first)
                w.write(second)
                w.write(third)
                w.write(fourth)
                ## Increment children count for child access later
                accessor = 'accessor="//@figures.0/@descriptors.'+str(descriptorNumber)+'/@accessors.'+str(numberOfChildren)+'"/>\n'
                accessorList.append([re.search('name="(\w*)Figure"',third).group(1),name,accessor])
                numberOfChildren = numberOfChildren + 1
            else: print "Ignoring label..."

    ## Add child access
    elif '</actualFigure>' in line:
        w.write(line)
        print "Adding child access"
        for i in xrange(numberOfChildren):
            figure = '\t  <accessors figure="//@figures.0/@descriptors.'+str(descriptorNumber)+'/@actualFigure/@children.'+str(i)+'"/>\n'
            w.write(figure)
        numberOfChildren = 0
        ## ignore all the other accessors in the read file
        while '</descriptors>' not in r.readline(): continue
        ## Print the closing brackets at the end
        w.write("\t  </descriptors>\n")

    ## Change to SVG as opposed to Rectangle which is default
    elif 'xsi:type="gmfgraph:Rectangle"' in line:
        print "Changing to display SVG figure"
        new = line.replace("Rectangle","SVGFigure")
        w.write(new)
        new = '\t\t  documentURI="file:///home/mike/src/visGrid/ie.tcd.gmf.visGrid/images/'+name.replace("Figure","").lower()+'.svg"\n'
        w.write(new)

    ## Otherwise write the line as it was in the original
    else:
        w.write(line)
    line = r.readline()
