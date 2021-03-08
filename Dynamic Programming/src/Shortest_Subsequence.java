import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.SliderUI;
public class Shortest_Subsequence {

	// Recursive Approach
	public static int solve(String a,String b){
	        
	        /* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
			if(a.length()==0){
	            return b.length()-1;
	        }
	        if(b.length()==0){
	            return a.length()-1;
	        }
	        int op1 = solve(a.substring(1),b);
	        char c = a.charAt(0);
	        int i=0;
	        for(;i<b.length();i++){
	            if(b.charAt(i)==c){
	                break;
	            }
	        }
	        if(i+1>=b.length()){
	            return op1;
	        }
	        int op2 = 1+solve(a.substring(1),b.substring(i+1));
	        return Math.min(op1,op2);
	}
	
	public static int solveDP(String a,String b){
		
		int m = a.length();
			int n = b.length();
			int[][] dp = new int[m + 1][n + 1];
			for(int i = 1; i <= m; i ++) {
				dp[i][0] = 1;
			}
			
			for(int j = 0; j <= n; j ++) {
				dp[0][j] = Integer.MAX_VALUE;
			}
			
			for(int i = 1; i <= m; i ++) {
				char ch = a.charAt(i - 1);
				for(int j = 1; j <= n; j ++) {
					// Searching
					int k;
					for(k = j - 1; k >= 0; k --) {
						if(b.charAt(k) == ch)
							break;
					}
					// Not Found
					if(k == -1)
						dp[i][j] = 1;
					else {
						int op1 = dp[i - 1][j];
						int op2 = dp[i - 1][k];
						if(op2 != Integer.MAX_VALUE)
							op2 ++;
						dp[i][j] = Math.min(op1, op2);
					}
				}
			}
			for(int i = 0; i <= m; i ++) {
				for(int j = 0; j <= n; j ++) {
					System.out.print(dp[i][j]+" ");
				}
				System.out.println();
			}
			
			return dp[m][n];
		}
	
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static void main(String[] args) throws IOException{
		
		String S,V;
		

		S = br.readLine();
		V = br.readLine();
		System.out.println(solveDP(S, V));
		System.out.println(solve(S,V));

	}

}
