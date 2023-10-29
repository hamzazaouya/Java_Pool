#!/bin/bash

GREEN='\033[0;32m'
RED='\033[0;31m'
NC='\033[0m'

SRC_FILES=" project/Main.java project/person/Person.java project/person/employee/Employee.java project/person/employee/salary/SalariedEmployee.java project/person/employee/hourly/HourlyEmployee.java"

javac -d classes $SRC_FILES

if [ $? -eq 0 ]; then
     echo -e "${GREEN}Compilation successful${NC}"
     cd classes
     java Main
     echo -e "${GREEN}Programe Was Runned Successful${NC}"
     cd ../
     rm -fr classes
else
    echo -e "${RED}Compilation failed${NC}"

fi