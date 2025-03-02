#!/bin/bash
echo "Enter number 1:"
read num1
echo "Enter number 2:"
read num2
echo "Enter number 3:"
read num3
echo "Enter number 4:"
read num4

sum=$((num1 + num2 + num3 + num4))  
avg=$((sum / 4))
product=$((num1 * num2 * num3 * num4))

echo "Sum is : $sum"
echo "Average is : $avg"
echo "Product is : $product"

OUTPUT :

Enter number 1:
100
Enter number 2:
200
Enter number 3:
300
Enter number 4:
400
Sum is : 1000
Average is : 250
Product is : 2400000000


Enter number 1:
10
Enter number 2:
15
Enter number 3:
20
Enter number 4:
25
Sum is : 70
Average is : 17
Product is : 75000


