import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Maximum_Square_Matrix_With_All_Zeros {

	
public static int findMaxSquareWithAllZeros(int[][] input){
        
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
    if(input.length==0){
        return 0;
    }
		int m = input.length;
		int n = input[0].length;
		int[][] dp = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(input[i][j]==1) {
					dp[i][j]=0;
				}else {
					dp[i][j]=1;
				}
			}
		}
		for(int i=m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				if(dp[i][j]!=0) {
				int op1 = dp[i][j+1] ;
				int op2 = dp[i+1][j+1];
				int op3 = dp[i+1][j];
				dp[i][j] = 1+Math.min(op1, Math.min(op2, op3));
				}
			}
			
		}
		
		int output = 0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				// System.out.print(dp[i][j]+" ");
				if(dp[i][j]>output) {
					output= dp[i][j];
				}
			}
			System.out.println();
		}
		return output;
		
	}
	
	
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    public static int[][] takeInput() throws IOException {

			        String[] nm;
			        nm = br.readLine().split("\\s");
			        int n = Integer.parseInt(nm[0]);
			        int m = Integer.parseInt(nm[1]);
					int arr[][]=new int[n][m];

			        if (n == 0) {
			            return arr;
			        }
			        

					String[] strNums;
			        for (int i = 0; i < n; ++i) {            
			            strNums = br.readLine().split("\\s");
			            for (int j = 0; j < m; ++j){
			                arr[i][j] = Integer.parseInt(strNums[j]);
			            }
			            
			        }

			        return arr;
			    }

				public static void main(String[] args) throws IOException {

			        int[][] arr = takeInput();
					System.out.println(findMaxSquareWithAllZeros(arr));
				}

}
