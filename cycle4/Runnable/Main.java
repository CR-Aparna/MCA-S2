import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the value of n for Fibonacci series
        System.out.print("Enter the value of n for Fibonacci series: ");
        int n = scanner.nextInt();

        // Read the range [start, end]
        System.out.print("Enter the range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Create instances of both classes
       
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter(start, end);
 // Create threads for both tasks
	Thread evenThread = new Thread(evenNumberPrinter);
 // Start both threads
	evenThread.start();
 
 FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(n);
       
        Thread fibonacciThread = new Thread(fibonacciGenerator);
        

       
        fibonacciThread.start();
        
    }
}



/*Enter the value of n for Fibonacci series: 15
Enter the range (start end): 1 20
even =2
even =4
even =6
even =8
even =10
even =12
even =14
even =16
even =18
even =20
fibonacci =0
fibonacci =1
fibonnoci = 1
fibonnoci = 2
fibonnoci = 3
fibonnoci = 5
fibonnoci = 8
fibonnoci = 13
fibonnoci = 21
fibonnoci = 34
fibonnoci = 55
fibonnoci = 89
fibonnoci = 144
fibonnoci = 233
fibonnoci = 377 */