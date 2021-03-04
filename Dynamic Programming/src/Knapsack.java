
public class Knapsack {
	/*
	 * A thief robbing a store can carry a maximal weight of W into his knapsack. 
	 * There are N items, and i-th item weigh 'Wi' and the value being 'Vi.' What would be the maximum value V, that the thief can steal?
		
		Input Format :
			The first line of the input contains an integer value N, which denotes the total number of items.
			The second line of input contains the N number of weights separated by a single space.
			The third line of input contains the N number of values separated by a single space.
			The fourth line of the input contains an integer value W, which denotes the maximum weight the thief can steal.
		
		Output Format :
			Print the maximum value of V that the thief can steal.
		Constraints :
			1 <= N <= 20
			1<= Wi <= 100
			1 <= Vi <= 100
		
		Time Limit: 1 sec
		Sample Input 1 :
			4
			1 2 4 5
			5 4 8 6
			5
		Sample Output 1 :
			13
		Sample Input 2 :
			5
			12 7 11 8 9
			24 13 23 15 16
			26
		Sample Output 2 :
			51
	 */

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		 return knapsackHelper(weights,values,maxWeight,0);

	}
	private static int knapsackHelper(int[] weights, int[] values, int maxWeight, int i) {
		if(i==weights.length || maxWeight==0) {
			return 0;
		}
		
		
		if(weights[i]>maxWeight) {
			return  knapsackHelper(weights, values, maxWeight, i+1);
		}else {
			int op1 = values[i]+ knapsackHelper(weights, values, maxWeight-weights[i], i+1);
			int op2 =knapsackHelper(weights, values, maxWeight, i+1);
			return Math.max(op1, op2);
		}
		
	}
//	public static int knapsackM(int[] weights, int[] values, int n, int maxWeight) {
//		int m =weights.length;
//		int dp[][]= new int[weights.length+1][maxWeight];
//		for(int i=0;i<m+1;i++) {
//			for( int j=0;j<maxWeight;j++) {
//				dp[i][j]= -1;
//			}
//		}
//		return knapsackM(weights, values, maxWeight,0,0,dp);
//	}
//	private static int knapsackM(int[] weights, int[] values, int maxWeight, int i,int j, int[][] dp) {
//		// TODO Auto-generated method stub
//		if(i>=weights.length+1|| j>=maxWeight) {
//			return 0;
//		}
//		if(dp[i][j]!= -1) {
//			return dp[i][j];
//		}
//		
//		return 0;
//	}
	
	
	public static int knapsackDP(int[] weights, int[] values, int n, int maxWeight) {
		int dp[][] = new int[weights.length+1][maxWeight+1];
		for(int i=0;i<weights.length+1;i++) {
			dp[i][0]= 0;
		}
		for(int j=0;j<maxWeight+1;j++) {
			dp[0][j]= 0;
		}
		
		for(int i=1;i<weights.length+1;i++) {
			for( int j=1;j<maxWeight+1;j++) {
				if(weights[i-1]>j) {
					dp[i][j]= dp[i-1][j]; // When I doesnt bat
				}else {
					dp[i][j]= Math.max(dp[i-1][j], values[i-1]+dp[i-1][j-weights[i-1]]);
				}
			}
		}
		for(int i=0;i<=weights.length;i++) {
			for( int j=0;j<maxWeight+1;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		return dp[weights.length][maxWeight];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weights[] = {2,5,1,3,4};
		int values[] = {15,14,10,45,30};
		int maxweight =7;
		System.out.println(knapsackDP(weights, values, weights.length, maxweight));
		System.out.println(knapsack(weights, values, weights.length, maxweight));

	}

}
