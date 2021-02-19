import java.util.Scanner;

public class InsertionSort {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static void InsertionSort(int[] array) {
		int temp=0;
		for(int i=1;i<array.length;i++) {
		
			for(int j=0;j<i;j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				
				}
				}
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
		InsertionSort(array);
		PrintArray(array);
	}

}
