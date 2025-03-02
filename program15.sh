#!/bin/bash

calculate() {
	First_num=$num1
	operator=$op
	Second_num=$num2
	case $operator in
		+) result=$(($First_num + $Second_num));;
		-) result=$(($First_num - $Second_num));;
		\*) result=$(($First_num * $Second_num));;
		/) result=$(($First_num / $Second_num));;
		%) result=$(($First_num % $Second_num));;
		*) echo "Invalid operation" ; exit 1;;
	esac
	echo "Result : $result"
}

echo "Enter first number:"
read num1
echo "Eneter an operator(+,-,*,/,%):"
read op
echo "Enter second number:"
read num2

calculate $num1 $op $num2


OUTPUT:

Enter first number:
10
Eneter an operator(+,-,*,/,%):
/
Enter second number:
5
Result : 2


Enter first number:
2
Eneter an operator(+,-,*,/,%):
*
Enter second number:
3
Result : 6

