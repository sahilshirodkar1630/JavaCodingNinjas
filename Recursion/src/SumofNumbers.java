import java.util.Scanner;

public class SumofNumbers {
	public static int Sum(int n) {
		if(n==1) {
			return 1;
		}
		int ans = n+Sum(n-1);
		return ans;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(Sum(n));
		
		
		
	}

}
