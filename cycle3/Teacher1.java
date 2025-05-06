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
			String Name = sc.next();
			System.out.println("\nEnter the Gender:");
			String Gender = sc.next();
			System.out.println("\nEnter the Address:");
			String Address = sc.next();
			System.out.println("\nEnter the Age:");
			int Age = sc.nextInt();
			System.out.println("\nEnter the Employee Id:");
			int Emp_id = sc.nextInt();
			System.out.println("\nEnter the Company Name:");
			String Comp_name = sc.next();
			System.out.println("\nEnter the Qualification:");
			String qualification = sc.next();
			System.out.println("\nEnter the Salary:");
			int salary = sc.nextInt();
			System.out.println("\nEnter the Subject:");
			String Subject = sc.next();
			System.out.println("\nEnter the Department:");
			String department = sc.next();
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

		



