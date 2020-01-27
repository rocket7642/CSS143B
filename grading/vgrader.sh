#!/bin/bash

set -e

function extract {
	if [ -d "extract" ]; then
		echo "vGRADER: folder extract exists. aborted"
		exit 1
	fi
	for f in *.zip 
		do
			student="${f%%_*}" 
				folder="extract/$student"
				mkdir -p "$folder" 
				cp "$f" "$folder"	
				pushd "$folder" > /dev/null 
				echo vGRADER: extracting $f to $folder
				unzip "$f" > /dev/null
				popd > /dev/null
		done
}

function run_one {
	CLASSPATH=`pwd` 
	javac -classpath $CLASSPATH Main.java;
	java -classpath $CLASSPATH Main;
	rm *.class
}

function run_all {
	for f in *roblem* 
	do
		pushd $f > /dev/null
		echo -----working in "$f"-----

		run_one

		popd > /dev/null
	done
}

if [ $# -eq 0 ]; then
    echo "Options:"
    echo "	--ex to extract"
    echo "	--run to run"
	echo "world at peace!"
    exit 1
fi

while test $# -gt 0
do
    case "$1" in
        --ex) extract 
            ;;
        --run_all) run_all 
            ;;
        --run_one) run_one 
            ;;
        --*) echo "bad option $1"
            ;;
        *) echo "argument $1"
            ;;
    esac
    shift
done
exit 0
