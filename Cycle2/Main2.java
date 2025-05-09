import java.util.Scanner;
class Employee{
	public String eNo;
	public String eName;
	public int eSalary;
	public Employee(String eNo,String eName,int eSalary){
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
	}
}
public class Main2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter count of employee list :");
		int count = Integer.parseInt(scan.nextLine());
		Employee[] employees = new Employee[count];
		for(int i=0;i<count;i++){
			System.out.print("Enter Number of Employee:");
			String eNo = scan.nextLine();
			System.out.print("Enter Name of the Employee:");
			String eName = scan.nextLine();
			System.out.print("Enter salary of Employee:");
			int eSalary = Integer.parseInt(scan.nextLine());
			employees[i] = new Employee(eNo,eName,eSalary);
		}
	System.out.println("Enter the number of Employee to be filtered out :");
	String search = scan.nextLine();
	for(int i=0;i<count;i++){
		if(employees[i].eNo.equals(search)){
			System.out.println("Employee Number: "+employees[i].eNo);
			System.out.println("Employee Name: "+employees[i].eName);
			System.out.println("Employee Salary: "+employees[i].eSalary);
		}
	}
}
}

/* Output
Enter count of employee list :3
Enter Number of Employee:1
Enter Name of the Employee:Alice John
Enter salary of Employee:50000
Enter Number of Employee:2
Enter Name of the Employee:John Doe
Enter salary of Employee:60000
Enter Number of Employee:3
Enter Name of the Employee:Jane Smith
Enter salary of Employee:45000
Enter the number of Employee to be filtered out :
2
Employee Number: 2
Employee Name: John Doe
Employee Salary: 60000
 */
	
	

			

			