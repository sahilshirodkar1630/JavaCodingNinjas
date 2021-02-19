import java.util.Scanner;

public class Question1 {
	
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
	public static void leaders(int[] a) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		
        
        for(int i=0;i<a.length-1;i++){
        	for(int j=i;i<a.length;j++) {
        		
        	}
            
           
        }
        System.out.println(a[a.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = Takeinput();
		leaders(array);
	}

}
