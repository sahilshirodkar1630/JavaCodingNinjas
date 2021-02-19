import java.util.Scanner;

public class Arrange_Numbers_in_Array {


	public static void arrange(int[] arr, int n) {
    	//Your code goes here
		int j=0;
		int val =1;
		while(j<=(n-1)/2) {
			arr[j]=val;
			val+=2;
			j++;
		}
		j=n-1;
		val=2;
		while(j>(n-1)/2) {
			arr[j]=val;
			val+=2;
			j--;
		}
		for(int i=0;i<=n-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//	   int n= sc.nextInt();
//	   int arr[] = new int[n];
//		  arrange(arr, n);
		int[] arr = new int[5];
		arr = new int[6];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		 
		}


}
