import sys 
import re
import shutil # to move files at the very end

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'''r''')
w = open(sys.argv[1]+".out",'''w''')
uri = sys.argv[2]

for line in r:
    if "documentURI=" in line:
