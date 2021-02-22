package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Running_Median {

//	You are given a stream of N integers.
//	For every i-th integer added to the running list of integers, print the resulting median.
//	Print only the integer part of the median.
//	Sample Input 1 :
//		6
//		6 2 1 3 7 5
//		Sample Output 1 :
//		6 4 2 2 3 4
//		Explanation of Sample Output 1 :
//		S = {6}, median = 6
//		S = {6, 2} -> {2, 6}, median = 4
//		S = {6, 2, 1} -> {1, 2, 6}, median = 2
//		S = {6, 2, 1, 3} -> {1, 2, 3, 6}, median = 2
//		S = {6, 2, 1, 3, 7} -> {1, 2, 3, 6, 7}, median = 3
//		S = {6, 2, 1, 3, 7, 5} -> {1, 2, 3, 5, 6, 7}, median = 4
//		Sample Input 2 :
//		5
//		5 4 3 2 1
//		Sample Output 2 :
//		5 4 4 3 3
	  public static void print(PriorityQueue<Integer> pq) {
		  for(int i: pq) {
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }
	public static void findMedian(int arr[])  {    
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		PriorityQueue<Integer> minPQ = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				maxPQ.add(arr[0]);
			}else {
				if(arr[i]<maxPQ.peek()) {
					maxPQ.add(arr[i]);	
				}else {
					minPQ.add(arr[i]);
				}
				if(maxPQ.size()>minPQ.size()+1) {
					int temp = maxPQ.remove();
					minPQ.add(temp); 
				}else if(minPQ.size()>maxPQ.size()+1) {
					int temp = minPQ.remove();
					maxPQ.add(temp); 
				}
				int ans;
				if(i%2!=0) {
					ans = (maxPQ.peek()+minPQ.peek())/2;
				}else {
					if(maxPQ.size()>minPQ.size()) {
					ans = maxPQ.peek();
					}else {
					ans = minPQ.peek();
					}
				}
			arr[i] = ans;  
			}
		}
		
    }
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static int[] takeInput() throws IOException {
	        int size = Integer.parseInt(br.readLine().trim());
	        int[] input = new int[size];

	        if (size == 0) {
	            return input;
	        }
	        
			String[] strNums;
			strNums = br.readLine().split("\\s");
			
	        for (int i = 0; i < size; ++i) {
	            input[i] = Integer.parseInt(strNums[i]);
	        }

	        return input;
	    }

	    public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {


	        int[] arr = takeInput();
	        findMedian(arr);
	        printArray(arr);


	    }

}
