package Assignments;

import java.util.Scanner;

public class Q2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int EvenSum=0;
	      int OddSum=0;
	      while (a>0) {
	    	  int temp =a%10;
	    	  if(temp%2==0) {
	    		  EvenSum=EvenSum+temp;
	    	  }else {
	    		  OddSum= OddSum+temp;
	    	  }
	    	  a = a/10;
	      }
	      System.out.print(EvenSum+" ");
	      System.out.println(OddSum);
		}
}