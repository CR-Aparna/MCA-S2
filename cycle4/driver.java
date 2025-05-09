import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        mul obj1 = new mul();
        obj1.start();
        prime obj2 = new prime(number);
        obj2.start();
    }
}


/*Enter the number :
20
All the prime numbers within 1 and 20are:

 Prime Number = 2 
 Prime Number = 3 
 Prime Number = 5 
 Prime Number = 7 
 Prime Number = 11 
 5*0 = 0

 5*1 = 5

 Prime Number = 13 
 Prime Number = 17 
 Prime Number = 19 
 5*2 = 10

 5*3 = 15

 5*4 = 20

 5*5 = 25

 5*6 = 30

 5*7 = 35

 5*8 = 40

 5*9 = 45

 5*10 = 50 */