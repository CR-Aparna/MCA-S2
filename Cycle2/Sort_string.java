import java.util.Scanner;

public class Sort_string {
	public static void main(String[] args) {
		String temp;
		int i, j, count;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of strings you would like to enter:");
		count = scan.nextInt();
		String[] str = new String[count];
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the strings one by one:");
		for (i = 0; i < count; i++) {
			str[i] = scan2.nextLine();
		}
		System.out.println("The strings before sorting:");
		for (i = 0; i < count; i++) {
			System.out.println(str[i]);
		}
		for (i = 0; i < count; i++) {
			for (j = i + 1; j < count; j++) {
				if ((str[i].compareTo(str[j])) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("\nThe Strings after sorting:");
		for (i = 0; i < count; i++) {
			System.out.println(str[i]);
		}
	}
}

/*
 * Output
 * Enter number of strings you would like to enter:5
 * Enter the strings one by one:
 * Java
 * Python
 * Cpp
 * Ruby
 * Html
 * The strings before sorting:
 * Java
 * Python
 * Cpp
 * Ruby
 * Html
 * 
 * The Strings after sorting:
 * Cpp
 * Html
 * Java
 * Python
 * Ruby
 */
