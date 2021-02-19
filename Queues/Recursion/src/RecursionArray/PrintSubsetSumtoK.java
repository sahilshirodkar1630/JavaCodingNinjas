package RecursionArray;

import java.util.Scanner;

public class PrintSubsetSumtoK {

	public static void printSubsetsSumTok(int input[], int k,int start,int[] output) {
		// Write your code here
		
        if(start>= input.length){
            if(k==0){
                for(int i=0;i<output.length;i++){
                    System.out.print(output[i]+" ");
                }
                System.out.println();
                return;
            }else{
                return;
            }
        }
           
        int[] ans = new int[output.length+1];
        ans[0]=input[start];
        for(int i=0;i<output.length;i++){
            ans[i]= output[i];
        }
        ans[ans.length-1]=input[start];
        printSubsetsSumTok(input,k-input[start],start+1,ans);
        
        printSubsetsSumTok(input,k,start+1,output);
	}
    public static void printSubsetsSumTok(int input[], int k) {
     int[] ans = new int[0];
    printSubsetsSumTok(input,k,0,ans);    
    }
	
		// TODO Auto-generated method stub
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
			printSubsetsSumTok(input, k);
		}
	

}
