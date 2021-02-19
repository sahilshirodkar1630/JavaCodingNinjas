import java.util.Scanner;

public class Bubble_Sort {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static void BubbleSort(int[] array) {
		int temp=0;
		for(int i=0;i<array.length-1;i++) {
		
			for(int j=0;j<array.length-1;j++) {
				if(array[j+1]<array[j]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			
			}
			
			PrintArray(array);
	
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
		BubbleSort(array);
		PrintArray(array);
		
	}

}
