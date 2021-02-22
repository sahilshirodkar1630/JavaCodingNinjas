package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Check_Max_Heap {

//	Given an array of integers, check whether it represents max-heap or not. 
//	Return true if the given array represents max-heap, else return false.
	
//	Sample Input 1:
//		8
//		42 20 18 6 14 11 9 4
//		Sample Output 1:
//		true
	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
        boolean isHeap = true;
        int  i=0;
         int leftChildIndex =1;
            int rightChildIndex =2;
        while(leftChildIndex<arr.length){
            if(leftChildIndex<arr.length){
                if(arr[leftChildIndex]>arr[i]){
                    isHeap =false;
                    break;
                }
                 if(rightChildIndex>arr.length&&arr[rightChildIndex]>arr[i]){
                    isHeap =false;
                    break;
                }
            }
            i++;
             leftChildIndex = 2*i+1;
            rightChildIndex = 2*i+2;
        }
        return isHeap;
	}
	
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(checkMaxHeap(input));
	}

}
