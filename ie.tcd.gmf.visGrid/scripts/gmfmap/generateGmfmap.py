# Takes 2 arguments, the gmfgraph and the gmfmap
# TODO: It would be great if this verified the gmfmap file, as it tends to be generated incorrectly. Also because of this there may be one or 2 duplicate entried in the gmfmap that you can delete (it's also good if you fix the cause of the problem, eg. Sometimes it puts attributes from house_a into house, no idea why)

import sys 
import re
import shutil # to move files at the very end

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
        print "Reading label"
        currentFigure = figure
        name = re.search('name="(\w+)"',line).group(1)
        figure = re.search('figure="(\w+)"',line).group(1)
        if figure != currentFigure:
            labels[figure] = []
        labels[figure].append(name)

line = readmap.readline()
while line.rstrip():
    search = re.search('href="visGrid.\w+#//(\w+)"',line) # get last href which should be the figure:
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
                print "Writing label mappings for " + figure
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

w.close()
readgraph.close()
readmap.close()

shutil.move(sys.argv[2]+'.out',sys.argv[2])
