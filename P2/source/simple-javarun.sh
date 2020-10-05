#!/usr/bin/bash
PROG_NAME=${1//.java}
mkdir -p out
javac $PROG_NAME.java -d out/
if [[ $? != 0 ]]; then 
    echo "Compilation Error!"
else
    cd out/
    java $PROG_NAME
fi
