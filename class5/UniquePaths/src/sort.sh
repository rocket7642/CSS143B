#!/bin/bash
set -x

CLASSPATH=`pwd`
javac -classpath $CLASSPATH Main.java
java -classpath $CLASSPATH Main $1 $2|grep -v '0\|testUniquePaths'|sort|uniq -c|sort -k1 -nr > freq
rm *.class

 
