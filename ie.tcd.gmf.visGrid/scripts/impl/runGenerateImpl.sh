#!/bin/bash
connection='ConnectionImpl.java'
for i in ../../src/visGrid/impl/*
do
    if [ $i != $connection ];
    then 
        python generateImpl $i
    fi
done
