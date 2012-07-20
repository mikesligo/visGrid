# Takes 2 arguments, the gmfgraph and the gmfmap

import sys 
import re

if (len(sys.argv) <2):
    sys.exit(0)

readgraph = open(sys.argv[1],'''r''')
readmap = open(sys.argv[2],'''r''')
w = open(sys.argv[2]+".out",'''w''')

labels = {}
currentFigure = ""
figure = ""

# Get labels
for line in readgraph:

    if "<labels " in line:
        currentFigure = figure
        name = re.search('name="(\w+)"',line).group(1)
        figure = re.search('figure="(\w+)"',line).group(1)
        if figure != currentFigure:
            labels[figure] = []
        labels[figure].append(name)

line = readmap.readline()
while line.rstrip():
    search = re.search('href="visGrid.ecore#//(\w+)"',line) # get last href which should be the figure:
    if search is not None:
        figure = search.group(1)
        w.write(line)
        line = readmap.readline()
        if "<labelMappings" in line:
            while "href" not in line and line.rstrip():
                w.write(line)
                line = readmap.readline()
            w.write(line)
            search = re.search('#(\w+)"',line)
            initial = search.group(1)
            for label in labels[figure+'Figure']:
                if label != initial:
                    while "</labelMappings" not in line:
                        line = readmap.readline() 
                        w.write(line)
                    isolated = label.replace(figure,"")
                    isolated = isolated[0:1].lower() + isolated[1:]
                    w.write('''      <labelMappings
          xsi:type="gmfmap:FeatureLabelMapping">
        <diagramLabel
            href="visGrid.gmfgraph#'''+label+'''"/>
        <features
            href="visGrid.ecore#//'''+figure+'''/'''+isolated+'''"/>
      </labelMappings>''')
                    w.write('\n')
    else: w.write(line)

    line = readmap.readline()

