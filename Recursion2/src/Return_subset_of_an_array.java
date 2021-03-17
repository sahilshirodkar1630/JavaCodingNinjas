import java.util.Scanner;

public class Return_subset_of_an_array {

	/*

Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 
	*/
	
	
	
	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[],int start) {
		// Write your code here
		//basecase 
		if(start>=input.length) {
            int empty[][] = new int[1][0];
			return empty;
		}
       int[][] smallAns  = subsets(input, start+1);
       int[][] output = new int[smallAns.length*2][];
       int k=0;
       for(int i=0;i<smallAns.length;i++) {
    	   output[k]= new int[smallAns[i].length];
    	   for(int j=0;j<smallAns[i].length;j++) {
    		   output[k][j]= smallAns[i][j];
    	   }
           k++;
       }
       for(int i=0;i<smallAns.length;i++) {
    	   output[k] = new int[smallAns[i].length+1];
    	   output[k][0]= input[start];
    	   for(int j=1;j<smallAns[i].length+1;j++) {
    		   output[k][j]=smallAns[i][j-1];
    
    	   }
           k++;
       }
       return output;
     
	}
	
	
	
	public static int[][] subsets(int input[]) {
		// Write your code here
		int[][] ans = subsets(input,0);
		return ans;

	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
