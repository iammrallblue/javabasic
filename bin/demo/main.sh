#!/bin/bash
echo "Welcome to Computer Science Society."
#--------------------------------------------
# Comment
# author：YuMing He
# email: xxx@student.gsu.edu
#--------------------------------------------
echo Choose the item you want to buy?
echo -e "A.Apple		Price:\$1 per each"
echo -e "B.Banana		Price:\$0.5 per each"
echo -e "C.Orange		Price:\$0.8 per each"
echo "Purchasing Date:"$(date +%m/%d/%y)
echo $pwd
echo $(ls -1 $HOME | egrep -c *.sh$)
echo $HOME
echo $PATH
echo $USER
echo $SHELL
ps | awk '{print $1}'
echo 'if x>2 y=x*2; else y=y/2;'
echo "Good bye..." $1
