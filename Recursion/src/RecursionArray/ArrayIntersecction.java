package RecursionArray;

import java.util.Scanner;

public class ArrayIntersecction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {5,8,7,4,8};
		int arr2[] = {4,6,6,10,8,5,5,1};
		intersection(arr1, arr2);
		
	}
	
	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		mergeSort(arr1);
		mergeSort(arr2);
	
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length) {
			System.out.println(arr1[i]+" "+arr2[j]);
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				if(i==arr1.length||j==arr2.length) {
					break;
				}
			}
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}
		}
	}

	private static void  merge(int[] input ,int start, int end) {

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
		private static void mergeSort(int[] input,int start, int end){

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

}
