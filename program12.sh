#!/bin/bash

echo "Enter a number:"
read num

fact=1
for ((i=1;i<=num;i++));do
	fact=$((fact*i))
done

echo "Factorial of $num is: $fact"

OUTPUT:

Enter a number:
4
Factorial of 4 is: 24

Enter a number:
0
Factorial of 0 is: 1

