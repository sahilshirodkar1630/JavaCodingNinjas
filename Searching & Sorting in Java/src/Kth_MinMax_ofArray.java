import java.util.Scanner;

public class Kth_MinMax_ofArray {

	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}
	public static int Sort(int a[]) {
		  for(int i=0;i<a.length;i++){
		        for(int j=0;j<a.length;j++){
		            if(a[i]<a[j]){
		                int temp = a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		        }
		    }
		  PrintArray(a);
		  return a[4-1];
		  
	}
	
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
//	             PrintArray(a1);
		        System.out.println(Sort(a1));
		      
//	             PrintArray(a1);

	}

}
}
