#!/bin/bash

echo "Enter a number:"
read num

sum=0
temp_num=$num

n=${#temp_num}

while [ $temp_num -gt 0 ]
do 
	digit=$((temp_num%10))
	sum=$((sum+digit**n))
	temp_num=$((temp_num/10))
done

if [ $sum -eq $num ];then
	echo "$num is an Armstrong number."
else
	echo "$num is not an Armstrong number."
fi

OUTPUT:

Enter a number:
153
153 is an Armstrong number.

Enter a number:
121
121 is not an Armstrong number.

