import java.awt.Robot;
import java.util.Scanner;

public class Cyclically_rotate_an_array_by_one {

	public static int[] Takeinput(){
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=s.nextInt();
	        }
	        
	         return array;

	}

	public  static void rotate(int arr[], int n)
    {
		int data[]= new  int [n];
		for(int i=0;i<arr.length;i++){
			data[i] = arr[i];
		}
        int temp = arr[arr.length-1];
        
        for(int i=1;i<n;i++){
            arr[i]=data[i-1];
        }
        arr[0]=temp;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = Takeinput();
		rotate(arr, arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}

}
