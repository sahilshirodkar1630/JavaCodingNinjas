import java.util.Scanner;

public class Return_Subsets_SumToK {

	public static int[][] subsetsSumK(int input[], int k ) {
        
        return subsetsSumK(input,k,0);
    }
	private static int[][] subsetsSumK(int[] input, int k, int start) {
		// TODO Auto-generated method stub
		if(start>=input.length) {
			if(k==0) {	
				int output[][] = new int[1][0];
				return output;
			}else {
				int output[][] = new int[0][0];
				return output;
			}
		}
		
		int[][] ansWithK = subsetsSumK(input, k-input[start], start+1);
		int[][] ansWithoutK = subsetsSumK(input, k, start+1);
		
		int[][] Output = new int[ansWithK.length+ansWithoutK.length][];
		int index=0;
		for(int i=0;i<ansWithK.length;i++) {
			Output[index] = new int[ansWithK[i].length+1];
			Output[index][0] = input[start];
			for(int j=1;j<ansWithK[i].length+1;j++) {
				Output[index][j]= ansWithK[i][j-1];
			}
			index++;
			
		}
		
		
		for(int i=0;i<ansWithoutK.length;i++) {
			Output[index] = new int[ansWithoutK[i].length];
			for(int j=0;j<ansWithoutK[i].length;j++) {
				Output[index][j] = ansWithoutK[i][j]; 
			}
			index++;
		}
		return Output;
	}
	
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
