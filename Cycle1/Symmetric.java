import java.util.Scanner;
public class Symmetric {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of the matrix");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns of the matrix");
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		int i,j;
		Boolean state= true;
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.println("Enter the element at M("+i+","+j+")");
				matrix[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(matrix[i][j]!=matrix[j][i]){
				state = false;
				break;
				}
			}
		}
		System.out.println("The given Matrix is:\n");
		for (i=0;i<row;i++){
			for (j=0;j<col;j++)
				System.out.print(matrix[i][j]+"\t");
				System.out.println();
		}

		if(state){
			System.out.println("Matrix is Symmetric");
		}
		else{
			System.out.println("Matrix is Antisymmetric");
		}
	}
}
		

		 
				
