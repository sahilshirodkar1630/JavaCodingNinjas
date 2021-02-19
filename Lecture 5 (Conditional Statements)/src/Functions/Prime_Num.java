package Functions;

import java.util.Scanner;

public class Prime_Num {
	
	public static boolean Prime(int n) {
		boolean ans =true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				ans=false;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Prime(n));
	}
}
