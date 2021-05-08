package Recursion2;

import java.util.Scanner;

public class ReturnSubsetsSumtoK {

	public static int[][] subsetsSumK(int input[], int k,int start) {
		// Write your code here
        if(start>=input.length){
            if(k==0){
                int output[][]= new int[1][0];
                return output;
            }else{
                int output[][]= new int[0][0];
            	return output;
            }
        }
        int[][] TempArray1 = subsetsSumK(input,k-input[start],start+1); 
        int[][] TempArray2 = subsetsSumK(input,k,start+1);
        
        int[][] output = new int [TempArray1.length+TempArray2.length][];
        
        int z=0;
        for(int i=0;i<TempArray1.length;i++,z++){
            output[z]= new int[TempArray1[i].length+1];
        output[z][0]= input[start];
            for(int j=1;j<=TempArray1[i].length;j++){
                output[z][j]= TempArray1[i][j-1];
            }
        }
        
        for(int i=0;i<TempArray2.length;i++,z++){
             output[z]= new int[TempArray2[i].length];
                 for(int j=0;j<TempArray2[i].length;j++){
                output[z][j]= TempArray2[i][j];
            }
        }
        return output;
        
    }
    	public static int[][] subsetsSumK(int input[], int k ) {
        
            return subsetsSumK(input,k,0);
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
