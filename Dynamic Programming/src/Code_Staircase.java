import java.util.Scanner;

public class Code_Staircase {
/*
	A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time.
	Implement a method to count and return all possible ways in which the child can run-up to the stairs.
		Input format :
			The first and the only line of input contains an integer value, 'n',
			denoting the total number of steps.
		
		Output format :
			Print the total possible number of ways.
		Sample Input 1:
			4
		Sample Output 1:
			7
		Sample Input 2:
			10
		Sample Output 2:
			274
			
*/
	//Normal Recursive Approoach
	public static long staircase(int n) {
		//Your code goes here
		if(n<0) {
			return 0;
		}else if(n==0) {
			return 1;
		}
		long count = 0;
		
		count+= staircase(n-1);
		count+= staircase(n-2);
		count+= staircase(n-3);
		return count;
	}
	//Dynamic Programing Approach O(N)
	public static long staircaseDP(int n) {
		long storage[]= new long[n+2];
		storage[0]=1;
		storage[1]= 1;
		storage[2]= 2;
		for(int i=3;i<=n;i++) {
			storage[i] = storage[i-1]+storage[i-2]+storage[i-3];
		}
		return storage[n];
	}
	
	public static void main( String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(staircaseDP(n));
		System.out.println(staircase(n));
		
	}
}

