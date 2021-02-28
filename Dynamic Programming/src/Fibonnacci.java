import java.util.Scanner;

public class Fibonnacci {
	

	// Normal Recursion Approach O(2^N)
	
	public static int fib(int n) {
		if(n==0 || n==1 ) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	
	// Memoization Approach O(n) 
	
	public static int fiboM(int n) {
		int[] storage = new int[n+1];
		for(int i=0;i<=n;i++) {
			storage[i] = -1;
		}
		return fiboM(n,storage);
	}
	public static int fiboM(int n,int[] storage) {
		if(n==0 || n==1 ) {
			storage[n]= n;
			return storage[n];
		}
		if(storage[n]!= -1) {
			return storage[n];
		}
		storage[n] = fiboM(n-1,storage)+fiboM(n-2,storage);
		return storage[n];
	}
	
   // Dynamic Programming Approach  O(n)
	
	public static int fibDP(int n) {
		int[] storage = new int[n+1];
		storage[0] = 0;
		storage[1] = 1;
		
		for(int i=2;i<=n;i++) {
			storage[i]= storage[i-1]+storage[i-2];
		}
		return storage[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibDP(n));
		System.out.println(fiboM(n));
		System.out.println(fib(n));
	}

}
