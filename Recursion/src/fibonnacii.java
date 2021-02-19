import java.util.Scanner;

public class fibonnacii {

	public static int fibo(int n) {
		if(n==1) {
			return n;
		}
		if(n==0) {
			return n;
		}
		
			int ans = fibo(n-1)+fibo(n-2);
			return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(fibo(n));
	}

}
