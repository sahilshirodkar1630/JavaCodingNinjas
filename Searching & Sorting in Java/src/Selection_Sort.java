import java.util.Scanner;

public class Selection_Sort {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static void SelectionSort(int[] array) {
		int min=0;
		int temp=0;
		for(int i=0;i<array.length;i++) {
//			min = array[i];
		
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min]) {
					min= j;
//					PrintArray(array);
					
				}
			
			}
			if(min!=i) {
			temp = array[i];
			array[i]= array[min];
			array[min] = temp;
			PrintArray(array);
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
		SelectionSort(array);
		PrintArray(array);
	}

}
