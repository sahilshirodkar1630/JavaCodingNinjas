import java.util.Scanner;

public class Swap_Ulternate {
	
	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	         return array;
	}
	public static void Swap(int[] a) {
		int temp=0;
		int i=0;
		int j=1;
		while(i<a.length) {
			temp = a[i];
			a[i]= a[j];
			a[j]= temp;
			i+=2;
			j+=2;
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
		int array[] = Takeinput();
		Swap(array);
		PrintArray(array);
		

	}

}
