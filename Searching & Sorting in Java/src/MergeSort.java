

import java.io.IOException;
import java.util.Scanner;

public class MergeSort {
	public static void  merge(int[] input ,int start, int end) {

		if(input.length<=1){
			return;
		}
		int mid = (start+end)/2;
		int i= start;
		int j=mid+1;
		int  k=0;
		int[] ans = new int[end-start+1];
		
		while(i<=mid&&j<=end) {
			if(input[i]<input[j]) {
				ans[k]=input[i];
				i++;
				k++;
				
			}else {
				ans[k]=input[j];
				j++;
				k++;
				
			}
		}
		while(i<=mid) {
			ans[k]=input[i];
			i++;
			k++;
		}
		
		while(j<=end) {
			ans[k]=input[j];
			j++;
			k++;
		}
		
		
		for(int a=0;a<ans.length;a++) {
			input[start+a]= ans[a];
		}
		return;
	}
		public static void mergeSort(int[] input,int start, int end){

		// Write your 
			if(start>=end) {
				return;
			}
		int mid = (start+end)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid+1, end);
		merge(input,start,end);
	}
	public static void mergeSort(int[] input){
		// Write your code here
		mergeSort(input, 0, input.length-1);
		return;
	}

	public static int[] Takeinput(int n){
		 Scanner sc = new Scanner(System.in);
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = Takeinput(n);
		mergeSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}

}
