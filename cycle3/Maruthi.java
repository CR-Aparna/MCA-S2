import java.util.Scanner;
class Vehicle {
	float mileage;
	int price;
	Vehicle(float mlg,int pr){
		mileage = mlg;
		price = pr;
	}
}
class Car extends Vehicle {
	float ownership_cost;
	int warranty;
	int seating_capacity;
	String fuel_type;
	Car(float mlg,int pr,float oc,int wty,int seca,String ft){
		super(mlg,pr);
		ownership_cost = oc;
		warranty = wty;
		seating_capacity = seca;
		fuel_type = ft;
	}
}
public class Maruthi extends Car {
	String model_type;
	Maruthi(float mlg,int pr,float oc,int wty,int seca,String ft,String mt){
		super(mlg,pr,oc,wty,seca,ft);
		model_type = mt;
	}
	void display() {
		System.out.println("\n Details of Maruthi Cars");
		System.out.println("Mileage : "+mileage);
		System.out.println("Price : "+price);
		System.out.println("Ownership cost : "+ownership_cost);
		System.out.println("Warranty : "+warranty);
		System.out.println("Seating Capacity : "+seating_capacity);
		System.out.println("Fuel Type : "+fuel_type);
	 	System.out.println("Model Type : "+model_type);
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of Cars: ");
		int num = sc1.nextInt();
		Maruthi[] arr = new Maruthi[num];
		
	
		for(int i=0;i<num;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("\n Enter the Details of Cars");
			System.out.println("\n Mileage: ");
			float mileage = sc.nextFloat();
			System.out.println("\n Price: ");
			int price = sc.nextInt();
			System.out.println("\nOwnership Cost: ");
			float ownership_cost = sc.nextFloat();
			System.out.println("\n Warranty: ");
			int warranty = sc.nextInt();
			System.out.println("\n Seating Capacity: ");
			int seating_capacity = sc.nextInt();
			System.out.println("\n Fuel Type: ");
			String fuel_type = sc.next();
			System.out.println("\n Model Type: ");
			String model_type = sc.next();
			
			arr[i] = new Maruthi(mileage,price,ownership_cost,warranty,seating_capacity,fuel_type,model_type);
		}
		System.out.println("\n-------Informations of Cars-------\n");
		for(int i=0;i<num;i++){
			arr[i].display();
			System.out.println("************************************");
		}
		sc1.close();
	}
}


/*Enter the number of Cars: 
3

 Enter the Details of Cars

 Mileage:
21.5

 Price:
550000

Ownership Cost:
75000

 Warranty:
2

 Seating Capacity:
5

 Fuel Type:
Petrol

 Model Type:
Swift

 Enter the Details of Cars

 Mileage:
22

 Price:
820000

Ownership Cost:
52000

 Warranty:
4

 Seating Capacity:
5

 Fuel Type:
Disel

 Model Type:
Baleno

 Enter the Details of Cars

 Mileage:
25

 Price:
1000000

Ownership Cost:
100000 

 Warranty:
3

 Seating Capacity:
7

 Fuel Type:
Disel

 Model Type:
Innova

-------Informations of Cars-------


 Details of Maruthi Cars
Mileage : 21.5
Price : 550000
Ownership cost : 75000.0
Warranty : 2
Seating Capacity : 5
Fuel Type : Petrol
Model Type : Swift
************************************

 Details of Maruthi Cars
Mileage : 22.0
Price : 820000
Ownership cost : 52000.0
Warranty : 4
Seating Capacity : 5
Fuel Type : Disel
Model Type : Baleno
************************************

 Details of Maruthi Cars
Mileage : 25.0
Price : 1000000
Ownership cost : 100000.0
Warranty : 3
Seating Capacity : 7
Fuel Type : Disel
Model Type : Innova
************************************ */
