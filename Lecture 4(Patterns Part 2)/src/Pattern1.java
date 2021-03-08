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
		
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int i=1;
//		while(i<=n) {
//			int k=1;
//			while(k<=n-i) {
//				System.out.print(" ");
//				k++;
//			}
//			k=1;
//			while(k<=i) {
//				System.out.print("*");
//				k++;
//			}
//			i++;
//			System.out.println();
//		}

	}

}
