import sys 
import re
import shutil

if (len(sys.argv) <2):
    sys.exit(0)

r = open(sys.argv[1],'r')
w = open(sys.argv[1]+'.swp','w')

line = r.readline()
while line:
    if 'package visGrid.impl;' in line:
        w.write(line)
        line=r.readline()
        if 'import java.util.HashMap;' in line:
            while 'import java.util.TimerTask;' not in line:
                line=r.readline()
            line=r.readline()
        w.write('''import java.util.HashMap;
        import java.util.Map;
        import java.util.Timer;
        import java.util.TimerTask;\n''')

    if 'public class ' in line:
        w.write(line)
        w.write('\t// Generated by python script located in this directory\n')
        line = r.readline()
        while 'boolean lock = false;' in line:
            line = r.readline()
        if '// Generated by python script located in this directory' in line:
            while '/**' not in line:
                line = r.readline()
        w.write('       boolean threadLock = false;\n')
        w.write('       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();\n');
        w.write('''\n   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (threadLock) return;
            if (entry.getValue() == false) return;
        }
        resetLock();
    }

    private void resetLock() {
        Timer timer = new Timer();
        class Task extends TimerTask{
            public void run() {
                threadLock = true;
                for (Map.Entry<String, Boolean> entry : lock.entrySet()){
                    entry.setValue(false);
                }
                threadLock = false;
            }   
        }
        timer.schedule(new Task(), lock.size()*30);
    }
    // END PYTHON GENERATED CODE\n''')
        w.write(line)

    else: 
        search = re.search('String get(\w+)\(\) \{', line)
        if search is not None:
            w.write(line)
            search = None
            while (search is None):
                line = r.readline()
                search = re.search('return (\w+);',line)
            key = search.group(1)
            print 'Adding http get for '+key
            w.write('\t\t// Generated by python script located in this directory\n')
            w.write('\t\t\tif (!lock.containsKey("'+key+'")) lock.put("'+key+'", new Boolean(false));\n')
            w.write('\t\t\tif (!(Boolean)lock.get("'+key+'")){\n')
            w.write('\t\t\t\tlock.put("'+key+'", true);\n')
            w.write('\t\t\t\tcheckUnlock();\n')
            if '__' in key:
                w.write('\t\t\t\t\tString val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"'+(key[0:1].lower()+key[1:]).replace("__","%20")+'");\n')
                w.write('\t\t\t\t\tif (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"'+(key[0:1].upper()+key[1:]).replace("__","%20")+'");\n')
            else:
                w.write('\t\t\t\t\tString val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"'+key[0:1].lower()+key[1:]+'");\n');
                w.write('\t\t\t\t\tif (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"'+key[0:1].upper()+key[1:]+'");\n')
            w.write('\t\t\t\t\t'+key[0:1].lower()+key[1:]+'= val;\n');
            w.write('\t\t\t}\n')
            w.write(line)

           # search = re.search('void set(\w+)\(String new(\w+)\) \{', line)
           # if search is not None:
           #     key = search.group(1)
           #     print "Adding http set for " + key
           #     w.write(line)
           #     w.write('\t\t// Generated by python script located in this directory\n')
           #     w.write('\t\thttp.Property.setValueOfProperty(this.getName().replace(" ", "%20"),"'+(key[0:1].lower()+key[1:]).replace("__","%20")+'", new'+search.group(2)+');\n')

        else: w.write(line)

    line = r.readline()

r.close()
w.close()
shutil.move(sys.argv[1]+'.swp',sys.argv[1])
