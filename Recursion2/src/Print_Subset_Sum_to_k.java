
public class Print_Subset_Sum_to_k {
/*
	Given an array A and an integer K, print all subsets of A which sum to K.
	Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
	Note : The order of subsets are not important. Just print them in different lines.
	Input format :
	Line 1 : Size of input array
	Line 2 : Array elements separated by space
	Line 3 : K 
	Sample Input:
	9 
	5 12 3 17 1 18 15 3 17 
	6
	Sample Output:
	3 3
	5 1
*/
	
	public static void printSubsetsSumTok(int input[], int k) {
        int[] ans = new int[0];
       printSubsetsSumTok(input,k,0,ans);    
	}
	
	
	private static void printSubsetsSumTok(int[] input, int k, int start, int[] output) {
	// TODO Auto-generated method stub
		if(start>= input.length) {
			if(k==0) {
				for(int i=0;i<output.length;i++) {
					System.out.print(output[i]+" ");
				}
				System.out.println();
				return;
			}else {
				return;
			}
			
		}
		
		int ans[] = new int[output.length+1];
	int i=0;
		for(;i<output.length;i++){
			ans[i]= output[i];
		}
		ans[i]= input[start];
			
			printSubsetsSumTok(input, k-input[start],start+1,ans);
			printSubsetsSumTok(input, k, start, output);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
