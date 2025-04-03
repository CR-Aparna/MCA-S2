import java.util.Scanner;
class Sports {
	String sport;
	int Rating;
	Sports(String spo, int ra){
		sport = spo;
		Rating = ra;
	}
}
class Student extends Sports {
	String Grade;
	double overall_per;
	Student(String spo,int ra,String gd,double per) {
		super(spo,ra);
		Grade = gd;
		overall_per = per;
	}
}
public class Result extends Student {
	Result(String spo,int ra,String gd,double per) {
		super(spo,ra,gd,per);
	}
	void display() {
		System.out.println("\n Sports Details of Student");
		System.out.println("Sport : "+sport);
		System.out.println("Rating : "+Rating);
		System.out.println("\nAcademic Details of Student");
		System.out.println("Academic Grade : "+Grade);
		System.out.println("Overall Percentage : "+overall_per);
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int num = sc1.nextInt();
		Result[] arr = new Result[num];
		
	
		for(int i=0;i<num;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("\n Enter the sports Details of Student");
			System.out.println("\n Sport: ");
			String sport = sc.next();
			System.out.println("\n Sport Rating out of 10: ");
			int Rating = sc.nextInt();
			System.out.println("\nEnter the academic Details of Students");
			System.out.println("\nAcademic Grade: ");
			String Grade = sc.next();
			System.out.println("\n Overall percentage: ");
			double overall_per = sc.nextDouble();
			arr[i] = new Result(sport,Rating,Grade,overall_per);
		}
		System.out.println("\n-------Informations of Students-------\n");
		for(int i=0;i<num;i++){
			arr[i].display();
			System.out.println("************************************");
		}
		sc1.close();
	}
}

/*

OUTPUT:
-------Informations of Students-------


 Sports Details of Student
Sport : Chess
Rating : 9

Academic Details of Student
Academic Grade : 13
Overall Percentage : 50.0
************************************

 Sports Details of Student
Sport : Badminton
Rating : 9

Academic Details of Student
Academic Grade : 17
Overall Percentage : 70.0
************************************

*/
