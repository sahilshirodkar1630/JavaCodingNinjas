package Pattern2;
import java.util.Scanner;

public class Pattern4 {
	
//	5
//    1
//   121
//  12321
// 1234321
//123454321

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        while(i<=n) {
        	int j =1;
        	while(j<=n-i) {
        		System.out.print(" ");
        	j++;
        	}
        	j=1;
        	while(j<=i) {
        		System.out.print(j);
        		j++;
        	}
        	j=1;
        	while(j<=i-1) {
        		System.out.print(i-j);
        		j++;
        	}
        	i++;
        	System.out.println();
        }

	}

}
