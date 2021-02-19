package Assignments;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int n = sc.nextInt();
	      int i=1;
	      int ans =1;
	      while (i<=n) {
	    	  ans = ans*x;
	    	  i++;
	      }
	      System.out.println(ans);

	}

}
