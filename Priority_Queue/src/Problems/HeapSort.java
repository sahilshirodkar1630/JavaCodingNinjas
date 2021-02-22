package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class HeapSort {
	
//	Given an integer array of size N. 
//	Sort this array (in decreasing order) using heap sort.
//	Note: Space complexity should be O(1).
	
	public static void insertIntoVirtualHeap(int[] arr,int data) {
		int childIndex = data;
		int parentIndex = (childIndex -1)/2;
		while(childIndex >0) {
			if(arr[childIndex] < arr[parentIndex]) {
				int temp = arr[childIndex];
				arr[childIndex]= arr[parentIndex];
				arr[parentIndex]= temp;
				childIndex= parentIndex;
				parentIndex=(childIndex-1)/2;
			}else {
				return;
			}
		}
	}
	
	public static int removeMin(int[] arr,int heapSize) {
		
		int minimum = arr[0];
		arr[0] = arr[heapSize-1] ;
		heapSize--;
		int parentIndex = 0;
		
		int leftChildIndex= 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;
		
		
		while(leftChildIndex < heapSize) {
			int index = parentIndex;
			if(arr[leftChildIndex]<arr[index]) {
				 index = leftChildIndex;
			}
            if(rightChildIndex<heapSize && arr[rightChildIndex] < arr[index]){
				 index = rightChildIndex;
			}
			if(index==parentIndex) {
				break;
			}else {
				int temp = arr[parentIndex];
				arr[parentIndex]= arr[index];
				arr[index]=temp;
				parentIndex=index;
			 leftChildIndex= 2*parentIndex+1;
	         rightChildIndex = 2*parentIndex+2;
			}
			
		}
		return minimum;
		
	}
	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		
		for(int i=0;i<arr.length;i++) {
		insertIntoVirtualHeap(arr, i);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			arr[arr.length-1-i]=removeMin(arr,arr.length-i);
			}
		
		
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		inplaceHeapSort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}
	
	
	
}
