#!/bin/bash
connection='../../src/visGrid/impl/ConnectionImpl.java'
realtime='../../src/visGrid/impl/TimeImpl.java'
factory='../../src/visGrid/impl/VisGridPackageImpl.java'

for i in ../../src/visGrid/impl/*.java
do
    if [ $i != $connection ];
    then 
        if [ $i != $realtime ];
        then
            if [ $i != $factory ];
                then
                    python generateImpl.py $i
            fi
        fi
    fi
done
