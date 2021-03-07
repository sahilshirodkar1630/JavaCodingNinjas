package Patterns;

import java.util.Scanner;

public class Pattern4 {

//	5
//	54321
//	54321
//	54321
//	54321
//	54321

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
//	        Appoarch 1
//	        int i=1;
//	        while(i<=n) {
//	        int j=n;
//	        while(j>0) {
//	        	System.out.print(j);
//	        	j--;
//	        }
//	        i++;
//	        System.out.println();
//	        }
//	        Appoarch 2
	        int i=1;
	        while(i<=n) {
	        int j=1;
	        while(j<=n) {
	        	System.out.print(n - j + 1);
	        	j++;
	        }
	        System.out.println();
	        i++;
	        
	        }

	}

}
