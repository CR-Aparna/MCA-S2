#!/bin/bash

echo -n "Enter the marks for subject 1:"
read sub1
echo -n "Enter the marks for subject 2:"
read sub2
echo -n "Enter the marks for subject 3:"
read sub3

total=$((sub1 + sub2 + sub3))
echo "Total marks: $total"

if [ $total -ge 270 ];then
	grade="A"
elif [ $total -ge 240 ];then
	grade="B"
elif [ $total -ge 210 ];then
	grade="C"
elif [ $total -ge 180 ];then
	grade="D"
else 
	grade="F"
fi

echo "Your grade : $grade"


OUTPUT:

Enter the marks for subject 1:95
Enter the marks for subject 2:72
Enter the marks for subject 3:83
Total marks: 250
Your grade : B


Enter the marks for subject 1:98
Enter the marks for subject 2:85
Enter the marks for subject 3:90
Total marks: 273
Your grade : A
	

