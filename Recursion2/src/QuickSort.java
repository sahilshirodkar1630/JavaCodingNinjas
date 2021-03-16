import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int a[], int start, int end) {
		if(start >= end) {
			return;
		}
		
		// This gives us the exact position of the pivot element
		int pivotPos = partition(a,start,end);
		// Call QuickSort again  for the elements before pivot position
		quickSort(a, start, pivotPos-1);
		// Call QuickSort again for the elements after pivot position
		quickSort(a, pivotPos+1, end);
		
	}

	private static int partition(int[] a, int start, int end) {
		
		int count =0;
		// Take the first element as Pivot
		int pivot = a[start];
		// Get the number of elements lesser than Pivot element Value 
		for(int i=start+1;i<=end;i++) {
			if(a[i] <= pivot){
				count++;
			}
		}
		// Place pivot at its  position;
		// Swap the pivot element with pivot position
		int pivotPos = start+count;
		int temp = a[pivotPos];
		a[pivotPos] = a[start];
		a[start] = temp;
		
		
		// Ensure all elements towards left less than pivot elements
		// & all elements towards right are greater than pivot position; 
		int i=start;
		int j=end;
	
		while(i<pivotPos && j>pivotPos) {
			if(a[i] <= pivot) {
				i++;
			}else if(a[j] > pivot) {
				j--;
			}else {
				temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return pivotPos;
	}
	
	public static void quickSort(int[] input) {
		quickSort(input, 0 , input.length-1);
	}
	
	
	
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
