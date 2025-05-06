import java.util.Scanner;

interface Prop {
	void getdata();
	void area();
	void perimeter();
}

class Circle implements Prop {
	double pi = 3.14;
	double r;
	Scanner sc = new Scanner(System.in);
	
	public void getdata() {
		System.out.println("Enter the radius of the circle:");
		r = sc.nextDouble();
		
	}
	
	public void perimeter() {
		System.out.println("Perimeter of the circle: "+(2*pi*r));
	}
	public void area() {
		System.out.println("Area of the circle :"+(pi*r*r));
	}
}

class Rectangle implements Prop {
	double l,b;
	Scanner sc = new Scanner(System.in);
	
	public void getdata() {
		System.out.println("Enter the Length of the Rectangle:");
		l = sc.nextDouble();
		System.out.println("Enter the Breadth of the Rectangle:");
		b = sc.nextDouble();
		
	}
	
	public void perimeter() {
		System.out.println("Perimeter of the Rectangle: "+(2*(l+b)));
	}
	public void area() {
		System.out.println("Area of the Rectangle :"+(l*b));
	}
}

public class Prototype {
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		Circle ob = new Circle();
		Rectangle obj = new Rectangle();
		do {
			System.out.println("\n1.Circle\n2.Rectangle\n3.Exit");
			System.out.println("Enter your choice :");
			ch = sc.nextInt();
			switch(ch) {
				case 1 :ob.getdata();
					ob.area();
					ob.perimeter();
					break;
				case 2 :obj.getdata();
					obj.area();
					obj.perimeter();
					break;
				case 3 :System.out.println("Exited...");
					System.exit(0);
			}
		}while(true);
	}
}


/* OUTPUT :

1.Circle
2.Rectangle
3.Exit
Enter your choice :
1
Enter the radius of the circle:
5
Area of the circle :78.5
Perimeter of the circle: 31.400000000000002

1.Circle
2.Rectangle
3.Exit
Enter your choice :
2
Enter the Length of the Rectangle:
5
Enter the Breadth of the Rectangle:
6
Area of the Rectangle :30.0
Perimeter of the Rectangle: 22.0

1.Circle
2.Rectangle
3.Exit
Enter your choice :
3
Exited...

*/

					
				
			
