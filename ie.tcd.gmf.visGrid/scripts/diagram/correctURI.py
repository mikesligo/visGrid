import sys 
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
        print ("Correcting " + line)
        w.write(line)
        w.write('''         File tempFile = new File("");\n''')
    elif '.setURI(' in line:
        w.write(line.replace('"file:///visGridImages','"file://"+tempFile.getAbsolutePath() +"/visGridImages'))
    else:
        w.write(line)
    line = r.readline()
r.close()
w.close()

shutil.move(sys.argv[1]+'.out',sys.argv[1])
