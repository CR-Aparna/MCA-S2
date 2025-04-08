import java.util.Scanner;
class Book {
	int accession_number;
	String title;
	String author;
	int edition;
	String publisher;
	
	void accept_info(Scanner sc) {
		System.out.println("Enter the Book informations:\n");
		System.out.print("Enter the Accession Number:\n");
		accession_number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Book title:\n");
		title = sc.nextLine();
		System.out.print("Enter the Author Name:\n");
		author = sc.nextLine();
		System.out.print("Enter the Book edition:\n");
		edition = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Publisher:\n");
		publisher = sc.nextLine();
	}

	void display_info() {
		System.out.println("_________________Book Details:_________________");
		System.out.println("Accession Nmber: "+accession_number);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Edition : "+edition);
		System.out.println("Publisher : "+publisher);
	}

	public static void main(Strings[] args){
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of books:");
		int num = sc1.nextInt();
		Book[] arr = new Book[num];

		for(int i=0;i<num;i++){
			arr[i] = new Book();
			arr[i].accept_info(sc);
		}

		System.out.println("Enter the Accession number of book to be searched:")
		int acc_search = sc.nextInt();
		for(int i=0;i<num;i++){
			if (arr[i].accession_number == acc_search) {
				
			}
		}
	}

		
	
