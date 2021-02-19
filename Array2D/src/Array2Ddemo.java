import java.util.Scanner;

public class Array2Ddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int array2D[][] = new int[r][c];
		for(int j=0;j<r;j++) {
		for(int i=0;i<c;i++) {
			array2D[j][i] = sc.nextInt();
		}
		}
		for(int j=0;j<r;j++) {
		for(int i=0;i<c;i++) {
			System.out.print(array2D[j][i]);
		}
		System.out.println();
		}
	}

}
