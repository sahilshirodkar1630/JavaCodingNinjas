package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i =1,val=1;
		while(i<=n) {
			int k=1;
			while (k <= n-i) {
				System.out.print(" ");
				k++;
				
			}
			int j=1;
			while(j<=i) {
				System.out.print(val+" ");
				j++;
				val++;
			}
			System.out.println();
			i++;
	
		}

	}

}
