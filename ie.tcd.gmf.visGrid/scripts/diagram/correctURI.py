import sys 
import re
import shutil # to move files at the very end

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'''r''')
w = open(sys.argv[1]+".out",'''w''')

line = r.readline()
while line:
    if 'package visGrid.diagram.edit.parts;' in line:
        w.write(line)
        w.write('    import java.io.File;\n')
    elif 'new SVGFigure()' in line:
        w.write(line)
        search = re.search("\s(\w+)FigureSVG",line)
        w.write('         File tempFile = new File("visGridImages/'+search.group(1)+'.svg");\n')
    elif '.setURI(' in line:
        print ("Correcting " + line)
        search = re.search("visGridImages/(\w+).svg",line)
        if search is not None:
            attr = search.group(1) # eg. Auction
            search = re.search("(\w+).setURI",line)
            if search is not None:
                seturi = search.group(1) # eg  auctionFigureSVG1, but can be nothing
                w.write('\t\t'+seturi+'.setURI(tempFile.toURI().toString());\n')
            else:
                w.write('\t\t.setURI(tempFile.toURI().toString());\n')
        else: w.write(line)
    else:
        w.write(line)
    line = r.readline()
r.close()
w.close()

shutil.move(sys.argv[1]+'.out',sys.argv[1])
