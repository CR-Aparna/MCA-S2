#!/bin/bash

read -p "Enter a string:" str

rev=$(echo "$str"| rev)

echo "Reversed String: $rev"

if [ "$str" == "$rev" ];then
	echo "The string is a palindrome."
else 
	echo "The string is not a palindrome."
fi

OUTPUT:

Enter a string:malayalam
Reversed String: malayalam
The string is a palindrome.

Enter a string:Black
Reversed String: kcalB
The string is not a palindrome.

