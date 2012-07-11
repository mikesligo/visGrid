#!/bin/bash
connection='../../src/visGrid/impl/ConnectionImpl.java'
for i in ../../src/visGrid/impl/*.java
do
    if [ $i != $connection ];
    then 
        python generateImpl.py $i
    fi
done
