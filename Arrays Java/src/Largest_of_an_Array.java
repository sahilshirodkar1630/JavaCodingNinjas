import java.util.Scanner;

public class Largest_of_an_Array {
	public static int Largest(int array[]) {
		int max= array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
			
		return max;
	}

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

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

	    
		   int[] array = Takeinput();
		   PrintArray(array); 
		   System.out.println("Largest number is "+Largest(array));
		   
		
	}

}
