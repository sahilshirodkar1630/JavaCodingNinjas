import java.util.Scanner;
public class Pattern1 {

//	5
//    *
//   **
//  ***
// ****
//*****

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int k=1;
			while(k<=n-i) {
				System.out.print(" ");
				k++;
			}
			k=1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();
		}

	}

}
