#!/bin/bash

echo "Enter a number:"
read num

sum=0

while [ $num -gt 0 ]
do
	digit=$((num%10))
	sum=$((sum + digit))
	num=$((num/10))
done

echo "Sum of digits of number entered : $sum"

OUTPUT:

Enter a number:
121
Sum of digits of number entered : 4


Enter a number:
0
Sum of digits of number entered : 0


