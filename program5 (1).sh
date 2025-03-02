#!/bin/bash
echo "Enter a number:"
read num
if [  $(( num % 2 )) -eq 0 ] ; then
	echo "$num ,is even"
else 
	echo "$num, is odd"
fi

OUTPUT :

Enter a number:
11
11, is odd

Enter a number:
44
44 ,is even


