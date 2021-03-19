import java.util.Scanner;

public class BInarySearchRecursive {

	
/*
	Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. 
	Return the index of x.
	Return -1 if x is not present in the given array.
	Note : If given array size is even, take first mid.
	Input format :
	
	Line 1 : Array size
	Line 2 : Array elements (separated by space)
	Line 3 : x (element to be searched)
	
	Sample Input :
	6
	2 3 4 5 6 8 
	5 
	Sample Output:
	3 
*/
	
	public static int binarySearch(int input[],int first, int last, int x) {
		if(first>last) {
			return -1;
		}
		int mid = (first+last)/2;
		if(input[mid]==x) {
			return mid;
		}else if(input[mid]> x) {
			return binarySearch(input, first, mid-1, x);
		}else {
			return binarySearch(input, mid+1, last, x);
		}
	}

	public static int binarySearch(int input[], int x) {
		return binarySearch(input,0,input.length-1,x);

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
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}

}
