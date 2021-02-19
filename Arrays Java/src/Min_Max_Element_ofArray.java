import java.util.Scanner;

public class Min_Max_Element_ofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc= new Scanner(System.in);
	        int t = sc.nextInt();
	        for(int i=0;i<t;i++){
	              int n = sc.nextInt();
	               int a1[] = new  int[n];
		        for(int j=0;j<=n-1;j++) {
		         a1[j]=sc.nextInt();
		        }
	             System.out.println("Minimum Element is "+Min(a1));
	             System.out.println(" Maximum Element is "+Max(a1));
	             
	             PrintArray(a1);
	        }
	}
		public static int Min(int a[]) {
			int min = a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i]<min) {
					min= a[i];
				}
			}
			return min;
		}
		public static int Max(int a[]) {
			int max = a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i]>max) {
					max= a[i];
				}
			}
			return max;
		}
		public static void PrintArray(int array[]) {
			int n= array.length;
			  for(int i=0;i<=n-1;i++) {
			        System.out.print(array[i]+" ");
			         
			        }
		        System.out.println();
		}
	
	
	

}
