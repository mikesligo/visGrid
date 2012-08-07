import sys

if (len(sys.argv) <2):
    sys.exit(0)

f = open(sys.argv[1],'r')

for line in f:
    line = line.replace("\n","")
    code = 'if (type.equals("%s")) {\n%s %s= factory.create%s();\n%s.setName(name);\ngrid.getConnections().add(%s);\n}'% (line.lower(),line,line.lower(),line,line.lower(),line.lower())
    print code
