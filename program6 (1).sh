#!/bin/bash
echo "Enter 1st number:"
read num1
echo "Enter 2nd number:"
read num2
echo "Enter 3rd number:"
read num3

if [ $num1 -ge $num2 ] && [ $num1 -ge $num3 ];then
	echo "$num1,is the largest"
elif [ $num2 -ge $num1 ] && [ $num2 -ge $num3 ];then
	echo "$num2, is the largest"
else
	echo "$num3, is largest"
fi

OUTPUT :

Enter 1st number:
10
Enter 2nd number:
20
Enter 3rd number:
30
30, is largest


Enter 1st number:
40
Enter 2nd number:
25
Enter 3rd number:
10
40,is the largest

	 
