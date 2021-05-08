

import java.util.Scanner;

public class AllIndexOfNumber {
//	All Indices of Number
//	Send Feedback
//	Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
//	Do this recursively. Indexing in the array starts from 0.
//	Input Format :
//	Line 1 : An Integer N i.e. size of array
//	Line 2 : N integers which are elements of the array, separated by spaces
//	Line 3 : Integer x
//	Output Format :
//	indexes where x is present in the array (separated by space)
//	Constraints :
//	1 <= N <= 10^3
//	Sample Input :
//	5
//	9 8 10 8 8
//	8
//	Sample Output :
//	1 3 4
	public static int[] allIndexes(int input[], int x,int startIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
        if(startIndex==input.length){
           int ans[]= new int[0];
            return ans ;
        }

        int ans[] =allIndexes(input,x,startIndex+1);
        
        
        int temp = input[startIndex];
        if(temp==x){
            int[] arr = new int[ans.length+1];
            
             
            arr[0]=startIndex;
            for(int i=0;i<ans.length;i++) {
        	arr[i+1]= ans[i];
             }
            
          
        return arr;
         
        }else{
        return ans;
        }
	}
    public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return allIndexes(input,x,0);
        
	}
    
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

}
