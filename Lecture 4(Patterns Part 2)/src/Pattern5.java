import java.util.Scanner;

public class Pattern5 {

//	5
//    1
//   232
//  34543
// 4567654
//567898765

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1, p=2;
        while(i<=n) {
        	int j =1;
        	while(j<=n-i) {
        		System.out.print(" ");
        	j++;
        	}
        	j=1;
        	while(j<=i) {
        		System.out.print(i+j-1);
        		j++;
        	}
        	j=1;
        	while(j<=i-1) {
        		System.out.print(p-j-1);
        		j++;
        	}
        	p=p+2;
        	i++;
        	System.out.println();
        }

	}


}
