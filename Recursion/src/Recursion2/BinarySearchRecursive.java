package Recursion2;


import java.util.Scanner;

public class BinarySearchRecursive {
	private static int binarySearch(int input[], int element,int start,int end) {
		// Write your code here
        int mid= (start+end)/2;
        if(start>=end){
            if(input[mid]==element){
                return mid;
            }
                return -1;
        }
        if(input[mid]==element){
            return mid;
        }
        if(element<input[mid]){
     		   return binarySearch(input,element,start,mid-1);
        }else{
               return binarySearch(input,element,mid+1,end);
        }
        
            
	}
    public static int binarySearch(int input[], int element) {
		// Write your code here
      return binarySearch(input,element,0,input.length-1);
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
