import java.util.Scanner;

public class Reverse_an_Array {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static void Reverse(int[] a ) {
		int i=0;
		int n=a.length-1;
		while(i<=n) {
			int temp = a[i];
			a[i] = a[n];
			a[n] = temp;
			i++;
			n--;
		}
	}
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= Takeinput();
		Reverse(array);
		PrintArray(array);

	}

}
