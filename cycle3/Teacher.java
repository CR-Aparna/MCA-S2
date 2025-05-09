import java.util.Scanner;
class Employee{
	int Empid;
	String Name;
	double Salary;
	String Address;
	
	Employee (int Empid,String Name,double Salary,String Address){
		this.Empid = Empid;
		this.Name = Name;
		this.Salary = Salary;
		this.Address = Address;
	}
}
class Teacher extends Employee {
	String dept;
	String subject;
	
	Teacher(int Empid,String Name,double Salary,String Address,String dept,String subject) {
		super(Empid,Name,Salary,Address);
		this.dept = dept;
		this.subject = subject;
	}
	
	void display() {
		System.out.println("Employee id: " +Empid);
		System.out.println("Name: " +Name);
		System.out.println("Salary: " +Salary);
		System.out.println("Address: " +Address);
		System.out.println("Department: " +dept);
		System.out.println("Subject: " +subject);
	}

	public static void main(String[] args) {
		System.out.println("\nEnter the no of Employees:");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		Teacher[] arr = new Teacher[num];

		for(int i=0;i<num;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter the Employee id:");
			int Empid = sc.nextInt();
			sc.nextLine();
			System.out.println("\nEnter the Employee Name:");
			String Name = sc.nextLine();
			System.out.println("\nEnter the Salary:");
			double Salary = sc.nextDouble();
			sc.nextLine();
			System.out.println("\nEnter the Address:");
			String Address = sc.nextLine();
			System.out.println("\nEnter the Department:");
			String dept = sc.nextLine();
			System.out.println("\nEnter the Subject:");
			String subject = sc.nextLine();
			arr[i] = new Teacher(Empid, Name,Salary,Address,dept,subject);
		}
		System.out.println("\n*******Informations of all the Employees *******");
		for (int i=0;i<num;i++){
			arr[i].display();
			System.out.println("----------------------------------------------");
		}
		sc1.close();
	}
}

	
/*
Enter the no of Employees:
3

Enter the Employee id:
121

Enter the Employee Name:
Alice Smith

Enter the Salary:
45000

Enter the Address:
123 Street

Enter the Department:
Computer Science

Enter the Subject:
Java Programming

Enter the Employee id:
133

Enter the Employee Name:
John Doe

Enter the Salary:
50000

Enter the Address:
456 Oak Avenue

Enter the Department:
Computer Applications

Enter the Subject:
Python Programming Lab

Enter the Employee id:
111

Enter the Employee Name:
Jane Austin 

Enter the Salary:
60000

Enter the Address:
789 Pine Road 

Enter the Department:
Physics

Enter the Subject:
Electrodynamics

*******Informations of all the Employees *******
Employee id: 121
Name: Alice Smith
Salary: 45000.0
Address: 123 Street
Department: Computer Science
Subject: Java Programming
----------------------------------------------
Employee id: 133
Name: John Doe
Salary: 50000.0
Address: 456 Oak Avenue
Department: Computer Applications
Subject: Python Programming Lab
----------------------------------------------
Employee id: 111
Name: Jane Austin
Salary: 60000.0
Address: 789 Pine Road
Department: Physics
Subject: Electrodynamics 
----------------------------------------------*/