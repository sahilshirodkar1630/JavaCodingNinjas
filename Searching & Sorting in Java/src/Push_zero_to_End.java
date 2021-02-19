import java.util.Scanner;

public class Push_zero_to_End {
//	7
//	2 0 0 1 3 0 0
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
	
	
	public static void Push(int[] a) {
		
		
		int k=0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.println(a[i]+" "+a[k]+" ");
				temp = a[i];
				a[i] = a[k];
				a[k] =temp;
				k++;
				PrintArray(a);
				
			}
//			for(int j=i;j<a.length;j++) {
//
//				if(a[i]==0) {
//					
//				}
//				
//			}

		}
		
	}
	public static void main(String[] args) {
		int array[] = Takeinput();
		Push(array);
		PrintArray(array);
		

	}

}
