package Recursion2;

import java.util.Scanner;

public class ReturnSubsetofArray {
	
//	public static int[][] subsets(int input[]) {
//		//String s[][] = new int[][];
//        return subsets(input, 0);
//	}
//    
//    static int[][] subsets(int input[], int SI){
//        if(SI>=input.length){
//            int a[][]=new int[1][0];
//        return a;
//    }
//        
//      	int smallAns[][] = subsets(input, SI+1);  
//      	int ans[][] = new int[2*smallAns.length][];
//        
//        int k=0;
//        for(int i=0;i<smallAns.length;i++,k++){
//            ans[k] = new int[smallAns[i].length];
//            for(int j=0;j<smallAns[i].length;j++)
//                ans[k][j]=smallAns[i][j];
//        }
//        
//         for(int i=0;i<smallAns.length;i++,k++){
//             ans[k] = new int[smallAns[i].length+1];
//             ans[k][0]=input[SI];
//             for(int j=1;j<=smallAns[i].length;j++)
//                 ans[k][j]=smallAns[i][j-1];
//         }
//        
//    }
	
 public static int[][] subsets(int input[],int start) {
		// Write your code here
     if(start>=input.length){
         int empty[][]= new int[1][0];
         return empty;
     } 
     int PrevAns[][]= subsets(input, start+1);   
     int ans[][]= new int[PrevAns.length*2][];
     int k=0;
     for(int i=0;i<PrevAns.length;i++,k++)   {
     	 ans[k]= new int[PrevAns[i].length];
     	for(int j=0;j<PrevAns[i].length;j++) {
     		ans[k][j]= PrevAns[i][j];
     		System.out.println(ans[i][j]);
     	}
     	
     }
     for(int i=0;i<PrevAns.length;i++,k++)   {
    	 ans[k]= new int[PrevAns[i].length+1];
    	 ans[k][0]=input[start];
    	for(int j=1;j<=PrevAns[i].length;j++) {
    		ans[k][j]= PrevAns[i][j-1];
    	}
     
    }
     return ans;
    
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
		// TODO Auto-generated method stub
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
