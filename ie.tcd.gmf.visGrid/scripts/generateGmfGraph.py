import sys 
import re

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'r')
w = open(sys.argv[1]+".out",'w')

labels=[]
labels.append("name")
name = ""

def keepLabel(line):
    ## Go through labels and check if they are contained in line
    ## If they are, then keep the line
    for label in labels:
        check = re.compile('"\w*[a-z0-9]%s\w*"'%label,re.IGNORECASE)
        match = check.search(line,re.IGNORECASE)
        if match : return True
    return False

numberOfChildren =0 ## needed for accessors
descriptorNumber =-1 ## needed for accessors
line = r.readline()
while line.rstrip():
    ## Having the last instance of name is often useful
    if 'name="' in line:
        search = re.search('name="(\w*)"',line)
        name = search.group(1)

    if '<descriptors' in line:
        descriptorNumber=descriptorNumber+1

    ## Remove all labels not specificied in 'labels'
    if '<children' in line:
        first = line
        second = r.readline()
        third = r.readline()
        fourth = r.readline()
        if 'xsi:type="gmfgraph:Label"' in second:
            if keepLabel(third):
                ## Write the four lines
                w.write(first)
                w.write(second)
                w.write(third)
                w.write(fourth)
                ## Increment children count for child access later
                numberOfChildren = numberOfChildren + 1

    ## Add child access
    elif '</actualFigure>' in line:
        for i in xrange(numberOfChildren):
            figure = '\t  <accessors\n\t\t  figure="//@figures.'+str(descriptorNumber)+'/@actualFigure/@children.'+str(i)+'"/>\n'
            w.write(figure)
        numberOfChildren = 0
        ## ignore all the other accessors in the read file
        while '</descriptors>' not in r.readline(): continue
        ## Print the closing brackets at the end
        w.write("\t  </descriptors>\n")

    ## Change to SVG as opposed to Rectangle which is default
    elif 'xsi:type="gmfgraph:Rectangle"' in line:
        new = line.replace("Rectangle","SVGFigure")
        w.write(new)
        new = '\t\t  documentURI="file://../images/'+name.replace("Figure","").lower()+'.svg"\n'
        w.write(new)

    ## Otherwise write the line as it was in the original
    else:
        w.write(line)
    line = r.readline()
