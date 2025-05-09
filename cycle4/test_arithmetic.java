import Arithmetic.Calculator;

public class test_arithmetic {
    public static void main(String[] args) {
        Calculator A = new Calculator();

        System.out.println("**OPERATIONS**");
        System.out.println("\n____ADDITION____");
        A.addition();

        System.out.println("\n____SUBTRACTION____");
        A.subtraction();

        System.out.println("\n____MULTIPLICATION____");
        A.multiplication();

        System.out.println("\n____DIVISION____");
        A.division();
    }
}


/***OPERATIONS**

____ADDITION____
Enter the first number :
30
Enter the second number :
20
Sum of given numbers is :50

____SUBTRACTION____
Enter the first number :
30
Enter the second number :
20
Difference of given numbers is :10

____MULTIPLICATION____
Enter the first number :
20
Enter the second number :
30
Product of given numbers is :600

____DIVISION____
Enter the first number :
60
Enter the second number :
20
Result of dividing given numbers is :3 */