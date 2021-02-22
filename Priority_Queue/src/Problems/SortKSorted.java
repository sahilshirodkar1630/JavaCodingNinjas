package Problems;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortKSorted {

	public static void sortKSorted(int arr[],int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int j=0;
		int i=0;
		for(i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		while(j<arr.length) {
		arr[j]= pq.remove();
		j++;
		if(i<arr.length) {
		pq.add(arr[i]);
		i++;
		}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int k= sc.nextInt();
		sortKSorted(arr, k);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
