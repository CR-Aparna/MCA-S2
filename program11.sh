#!/bin/bash

names=("Ali" "Melvi" "Govind")
echo "The number of names in list: ${#names[@]}"
echo "The name in the 2nd index is: ${names[2]}"
echo "The list of names is:"
for name in "${names[@]}" ; do
	echo $name
done

	
OUTPUT:

The number of names in list: 3
The name in the 2nd index is: Govind
The list of names is:
Ali
Melvi
Govind

