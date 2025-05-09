import java.util.Scanner;
class Publisher {
	String publisher;
	Publisher(String pub) {
		this.publisher=pub;
	}
}
class Book extends Publisher {
	String book;
	String category;
	Book(String pub,String book,String category) {
		super(pub);
		this.book = book;
		this.category = category;
	}
}
class Literature extends Book {
	Literature(String pub,String book,String category) {
		super(pub,book,category);
	}
	void display() {
		System.out.println("Publisher : "+publisher);
		System.out.println("Book :"+book);
		System.out.println("Category :"+category);
	}
}
class Fiction extends Book {
	Fiction(String pub, String book,String category){
		super(pub,book,category);
	}
	void display() {
		System.out.println("Publisher :"+publisher);
		System.out.println("Book: "+book);
		System.out.println("Category :"+category);
	}
}

public class BookDetails {
	public static void main(String[] args){
		System.out.print("\nEnter the No.of Literature Books");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		Literature arr[] = new Literature[num];
		System.out.println("\n Enter the literature book details\n");
		int x = 0,j = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < num;i++){
			x = i + 1;
			System.out.println("\n"+x+").");
			System.out.print("\n Book : ");
			String book = sc.nextLine();
			System.out.print("\n Publisher: ");
			String pub = sc.nextLine();
			System.out.print("\n Category: ");
			String category = sc.nextLine();

			arr[i] = new Literature(book,pub,category);
		}
		System.out.println("\nEnter the No. of fiction Books");
		int num1 = sc1.nextInt();
		Fiction arr1[] = new Fiction[num1];
		System.out.println("\nEnter the fiction Book Details\n");
		int x1 = 0,j1 = 0;
		for(int i = 0;i < num1;i++){
			x1 = i + 1;
			System.out.println("\n"+x1+").");
			System.out.print("\n Book : ");
			String book = sc.nextLine();
			System.out.print("\n Publisher: ");
			String pub = sc.nextLine();
			System.out.print("\n Category: ");
			String category = sc.nextLine();

			arr1[i] = new Fiction(book,pub,category);
		}
		sc.close();
		
		System.out.println("\n*********Informations of all the Literature Books**********");
		for(int i =0;i<num;i++){
			j = i +1;
			System.out.println("\n"+j+").");
			arr[i].display();
		}
		System.out.println("\n*********Informations of all the Fiction Books**********");
		for(int i =0;i<num1;i++){
			j1 = i +1;
			System.out.println("\n"+j1+").");
			arr1[i].display();
		}
	sc1.close();
}
}


/*
Enter the No.of Literature Books2

 Enter the literature book details


1).

 Book : Hamlet

 Publisher: Penguin

 Category: Tragedy

2).

 Book : Leaves of Grass

 Publisher: Harper & Brothers

 Category: Poetry

Enter the No. of fiction Books
2

Enter the fiction Book Details


1).

 Book : 1984

 Publisher: Secker & Warburg

 Category: Dystopian

2).

 Book : Brave New World

 Publisher: Chatto & Windus

 Category: Sci-Fi

*********Informations of all the Literature Books**********

1).
Publisher : Hamlet
Book :Penguin
Category :Tragedy

2).
Publisher : Leaves of Grass
Book :Harper & Brothers
Category :Poetry

*********Informations of all the Fiction Books**********

1).
Publisher :1984
Book: Secker & Warburg
Category :Dystopian

2).
Publisher :Brave New World
Book: Chatto & Windus
Category :Sci-Fi */




