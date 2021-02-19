import java.util.Scanner;

public class Factorial {
	
	 public static int fact(int n) {
		 if(n==0) {
//			 Basecase
			 return 1;
		 }
		int Ans = n* fact(n-1);
		return Ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fact(n);
		System.out.println(ans);
		

	}

}
