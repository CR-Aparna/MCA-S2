#!/bin/bash

echo -n "Enter a number:"
read num

echo "Multiplication table of $num:"

for i in {1..10}
do
	echo "$num x $i = $((num*i))"
done


OUTPUT:

Enter a number:7
Multiplication table of 7:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70

