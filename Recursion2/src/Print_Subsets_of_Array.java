
public class Print_Subsets_of_Array {

	/*
	 Given an integer array (of length n), find and print all the subsets of input array.
	Subsets are of length varying from 0 to n, that contain elements of the array.
	But the order of elements should remain same as in the input array.
	Note : The order of subsets are not important. Just print the subsets in different lines.
	Input format :
		Line 1 : Integer n, Size of array
		Line 2 : Array elements (separated by space)
		
	Constraints :
	1 <= n <= 15
	
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
	   public static void printSubsets(int input[],int start,int[] output)
       {
		// Write your code here
           if(start>=input.length) {
                for(int i: output){
                    System.out.print(i+" ");
                }
                System.out.println();
                return;
			}
            int ans[] = new int[output.length+1];
            int i=0;
            for(;i<output.length;i++) {
                ans[i]= output[i];
            }
            ans[i]= input[start];
            printSubsets(input, start+1, ans);
            printSubsets(input, start+1, output);
	}
    public static void printSubsets(int input[]) {
		// Write your code here
        int [] op = new int[0];
        printSubsets(input,0,op);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
