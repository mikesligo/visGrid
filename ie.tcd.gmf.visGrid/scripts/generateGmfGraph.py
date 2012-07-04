import sys 

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'r')
w = open(sys.argv[1]+".out",'w')

name = ""
for line in r:
    if 'name="' in line:
        start = line.find('"',0)+1
        end = line.find('"',start)
        name=line[start:end]
        w.write(line)
    elif 'xsi:type="gmfgraph:Rectangle"' in line:
        w.write("\t\t"+'xsi:type="gmfgraph:SVGFigure"'+"\n")
    else:
        w.write(line)
