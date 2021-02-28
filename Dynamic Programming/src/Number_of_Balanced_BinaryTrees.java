import java.util.Scanner;

public class Number_of_Balanced_BinaryTrees {

	// Normal Recursion Approach 
	public static int countBalancedBTs(int h) {
		int mod =(int)Math.pow(10,9)+7;
		return countBalancedBTs(h,mod);
	}
	public static int countBalancedBTs(int h,int mod) {
		if(h==0||h==1) {
			return 1;
		}
	
		int x= countBalancedBTs(h-1,mod);
		int y = countBalancedBTs(h-2,mod);
		long a = (long) x*x;
		long b = (long) 2 * x * y;
		int value1 = (int)(a%mod);
		int value2 = (int)(b%mod);
		return  (value1+value2)%mod;
	
		
	}
	// Dynamic Programming Approach O(N)
	public static int countbalancedDP(int h) {
		int mod = (int)Math.pow(10,9)+7;
		int dp[]= new int[h+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=h;i++) {
			int x= dp[i-1];
			int y = dp[i-2];
			long a = (long)x * x;
			long b = (long)2 * x * y;
			int value1 = (int)(a%mod);
			int value2 = (int)(b%mod);
			
			dp[i]= (value1+value2)%mod;
		}
		return dp[h];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int height = sc.nextInt();
		System.out.println(countbalancedDP(height));
		System.out.println(countBalancedBTs(height));
	}

}
