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
			System.out.println("\nEnter the Employee Name:");
			String Name = sc.next();
			System.out.println("\nEnter the Salary:");
			double Salary = sc.nextDouble();
			System.out.println("\nEnter the Address:");
			String Address = sc.next();
			System.out.println("\nEnter the Department:");
			String dept = sc.next();
			System.out.println("\nEnter the Subject:");
			String subject = sc.next();
			arr[i] = new Teacher(Empid, Name,Salary,Address,dept,subject);
		}
		System.out.println("\n*******Informations of all the Employees *******");
		for (int i=0;i<num;i++){
			arr[i].display();
		}
		sc1.close();
	}
}

	
