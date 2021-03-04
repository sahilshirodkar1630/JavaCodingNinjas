import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Longest_Increasing_Subsequence {
/*
	Given an array with N elements, you need to find the length of the longest subsequence 
	in the given array such that all elements of the subsequence are sorted in strictly increasing order.
	Input Format
	The first line of input contains an integer N. 
	The following line contains N space separated integers,
	 that denote the value of elements of array.
	Output Format
	The first and only line of output contains the length of longest subsequence.
	Constraints
	1 <= N <= 10^3
	Time Limit: 1 second
	Sample Input 1 :
	6
	5 4 11 1 16 8
	Sample Output 1 :
	3
	Sample Output Explanation
	Length of longest subsequence is 3 i.e. (5,11,16) or (4,11,16).
	Sample Input 2 :
	3
	1 2 2
	Sample Output 2 :
	2
	*/
	
public static int lis(int arr[]) {
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

        int dp[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
          int val = 1;
            int j=i-1;
            while(j>=0){
               if(arr[i]>arr[j]){
                   if(dp[j]>=val){
                       val= dp[j]+1;
                   }
               } 
                j--;
            }
            dp[i]=val;
        }
        int output =0;
        for(int i=0;i<dp.length;i++){
            // System.out.print(dp[i]+" ");

            if(dp[i]>output){
                output=dp[i];
            }
        }
        return output;
    }

	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public static int[] takeInput() throws IOException {
    int size = Integer.parseInt(br.readLine().trim());
    int[] input = new int[size];

    if (size == 0) {
        return input;
    }
    
	String[] strNums;
	strNums = br.readLine().split("\\s");
	
    for (int i = 0; i < size; ++i) {
        input[i] = Integer.parseInt(strNums[i]);
    }

    return input;
}

public static void printArray(int[] arr) {
    for (int element : arr) {
        System.out.print(element + " ");
    }

    System.out.println();
}

public static void main(String[] args) throws NumberFormatException, IOException {

    int[] arr = takeInput();
    System.out.println(lis(arr));

}

}
