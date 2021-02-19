import java.util.Scanner;

public class Question3Array2D {

	public static int[][] Takeinput() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int array2D[][] = new int[r][c];
		for(int j=0;j<r;j++) {
		for(int i=0;i<c;i++) {
			array2D[j][i] = sc.nextInt();
		}
		}
		return array2D;
	}
	public static void Print2D(int array2D[][])
	{
		int r = array2D.length;
		int c = array2D[0].length;
		for(int j=0;j<r;j++) {
			for(int i=0;i<c;i++) {
				System.out.print(array2D[j][i]+" ");
			}
			System.out.println();
	}
	}
	public static void print2DArray(int a[][]) {
		// Write your code here
		int n=a.length-1;
		for(int i=0;i<a.length;i++) {
			int val= a[0][n-i];
			while(val>0) {
			for(int j=0;j<a[0].length;j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			val--;
			}
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a2D[][] = Takeinput();
		print2DArray(a2D);
				
	}

}
