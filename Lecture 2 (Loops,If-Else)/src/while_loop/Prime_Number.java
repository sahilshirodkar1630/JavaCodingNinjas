package while_loop;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i=2;
		while (i<=n-1) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				return;
			}
			i++;
		}
		System.out.println(n +" is a Prime numebr");

	}

}
