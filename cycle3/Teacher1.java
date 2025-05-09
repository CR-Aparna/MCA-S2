import java.util.Scanner;
class Person {
	String Name;
	String Gender;
	String Address;
	int Age;

	Person(String Name,String Gender,String Address,int Age){
		this.Name = Name;
		this.Gender = Gender;
		this.Address = Address;
		this.Age = Age;
	}
}
class Employee extends Person {
	int Emp_id;
	String Comp_name;
	String qualification;
	int salary;

	Employee(String Name,String Gender,String Address,int Age,int Emp_id,String Comp_name,String qualification,int salary){
		super(Name,Gender,Address,Age);
		this.Emp_id = Emp_id;
		this.Comp_name = Comp_name;
		this.qualification = qualification;
		this.salary= salary;
	}
}
class Teacher1 extends Employee {
	String Subject;
	String department;
	int Tchr_id;

	Teacher1(String Name,String Gender,String Address,int Age,int Emp_id,String Comp_name,String qualification,int salary,String Subject,String department,int Tchr_id){
		super(Name,Gender,Address,Age,Emp_id,Comp_name,qualification,salary);
		this.Subject = Subject;
		this.department = department;
		this.Tchr_id = Tchr_id;
	}

	void display() {
		System.out.println("Name: " +Name);
		System.out.println("Gender: " +Gender);
		System.out.println("Address: " +Address);
		System.out.println("Age: " +Age);
		System.out.println("Employee id: " +Emp_id);
		System.out.println("Company Name: " +Comp_name);
		System.out.println("Qualification: " +qualification);
		System.out.println("Salary: " +salary);
		System.out.println("Subject: " +Subject);
		System.out.println("Department: " +department);
		System.out.println("Teacher id: " +Tchr_id);
	}

	public static void main(String[] args) {
		System.out.println("\nEnter the no of Persons:");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		Teacher1[] arr = new Teacher1[num];

		for(int i=0;i<num;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter the Name:");
			String Name = sc.nextLine();
			System.out.println("\nEnter the Gender:");
			String Gender = sc.nextLine();
			System.out.println("\nEnter the Address:");
			String Address = sc.nextLine();
			System.out.println("\nEnter the Age:");
			int Age = sc.nextInt();
			System.out.println("\nEnter the Employee Id:");
			int Emp_id = sc.nextInt();
			sc.nextLine();
			System.out.println("\nEnter the Company Name:");
			String Comp_name = sc.nextLine();
			System.out.println("\nEnter the Qualification:");
			String qualification = sc.nextLine();
			System.out.println("\nEnter the Salary:");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println("\nEnter the Subject:");
			String Subject = sc.nextLine();
			System.out.println("\nEnter the Department:");
			String department = sc.nextLine();
			System.out.println("\nEnter the Teacher Id:");
			int Tchr_id = sc.nextInt();
			arr[i] = new Teacher1(Name,Gender,Address,Age,Emp_id,Comp_name,qualification,salary,Subject,department,Tchr_id);
		}
		System.out.println("\n*******Informations of all the Persons *******");
		for (int i=0;i<num;i++){
			arr[i].display();
			System.out.println("______________________________________________");
		}
		sc1.close();
	}
}


/*
Enter the no of Persons:
3

Enter the Name:
Jake Sully

Enter the Gender:
Male

Enter the Address:
Street No.1

Enter the Age:
35

Enter the Employee Id:
1234

Enter the Company Name:
TechNova Pvt Ltd 

Enter the Qualification:
Computer Science

Enter the Salary:
50000 

Enter the Subject:
Data Structures

Enter the Department:
Computer Science

Enter the Teacher Id:
501

Enter the Name:
John Smith

Enter the Gender:
Male

Enter the Address:
12,MG Road,Kochi

Enter the Age:
32

Enter the Employee Id:
4536

Enter the Company Name:
Innova Tech

Enter the Qualification:
Mtech

Enter the Salary:
65000 

Enter the Subject:
Machine Learning

Enter the Department:
Information Technology

Enter the Teacher Id:
535

Enter the Name:
Erwin Schrodinger

Enter the Gender:
Male

Enter the Address:
5,Pine Bridge

Enter the Age:
45

Enter the Employee Id:
234

Enter the Company Name:
Sciencia

Enter the Qualification:
PhD

Enter the Salary:
75000 

Enter the Subject:
Quantum Mechanics

Enter the Department:
Physics

Enter the Teacher Id:
675

*******Informations of all the Persons *******
Name: Jake Sully
Gender: Male
Address: Street No.1
Age: 35
Employee id: 1234
Company Name: TechNova Pvt Ltd
Qualification: Computer Science
Salary: 50000
Subject: Data Structures
Department: Computer Science
Teacher id: 501
______________________________________________
Name: John Smith
Gender: Male
Address: 12,MG Road,Kochi
Age: 32
Employee id: 4536
Company Name: Innova Tech
Qualification: Mtech
Salary: 65000
Subject: Machine Learning
Department: Information Technology
Teacher id: 535
______________________________________________
Name: Erwin Schrodinger
Gender: Male
Address: 5,Pine Bridge
Age: 45
Employee id: 234
Company Name: Sciencia
Qualification: PhD
Salary: 75000
Subject: Quantum Mechanics
Department: Physics
Teacher id: 675
______________________________________________ */
		



