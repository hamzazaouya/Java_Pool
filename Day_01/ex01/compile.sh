#!/bin/bash

GREEN='\033[0;32m'
RED='\033[0;31m'
NC='\033[0m'

SRC_FILES="Program.java UserIdsGenerator.java User.java"

if [ "$1" == "make" ]; then
    javac -d classes $SRC_FILES
    if [ $? -eq 0 ]; then
        echo -e "${GREEN}Compilation successful${NC}"
        cd classes
        java Program
        echo -e "${GREEN}Program was run successfully${NC}"
    else
        echo -e "${RED}Compilation failed${NC}"
    fi
elif [ "$1" == "destroy" ]; then
    rm -fr classes
else
    echo -e "${RED} Usage: $0 [make|destroy] ${NC}"
    exit 1
fi
