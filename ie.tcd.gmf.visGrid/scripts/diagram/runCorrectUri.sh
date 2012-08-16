#!/bin/bash

for i in ../../../ie.tcd.gmf.visGrid.diagram/src/visGrid/diagram/edit/parts/*.java
do
    python correctURI.py $i
done
