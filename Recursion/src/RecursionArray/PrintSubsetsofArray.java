package RecursionArray;

import java.util.Scanner;

public class PrintSubsetsofArray {

	public static void printSubsets(int input[],int start,int[]output) {
		// Write your code here
 
        if(start>=input.length){
        	for(int i=0;i<output.length;i++){
                System.out.print(output[i]);
            }
            System.out.println();
            return;
        }
      
        int[] temp = new int[output.length+1];
        
        for(int i=0;i<output.length;i++){
            temp[i]=output[i];
        }
        temp[temp.length-1]=input[start];
        printSubsets(input,start+1,temp);
        
        printSubsets(input,start+1,output);
        
        
	}
    public static void printSubsets(int input[]) {
		// Write your code here
        int [] op = new int[0];
        printSubsets(input,0,op);

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
		printSubsets(input);
	}

}
