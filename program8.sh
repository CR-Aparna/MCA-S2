#!/bin/bash 
echo "Enter a year:"
read year
if [ $((year % 4)) -eq 0 ] && [ $((year % 100)) -ne 0 ] || [ $((year % 400)) -eq 0 ];then
	echo "$year is a leap year." 
else 
	echo "$year is not a leap year."
fi

OUTPUT :

Enter a year:
2000
2000 is a leap year.


Enter a year:
2025
2025 is not a leap year.


