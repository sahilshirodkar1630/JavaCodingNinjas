package Patterns;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated methodfdsjhkfs
		   Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
//	        int i=1,val=1;
//	        while(i<=n){
//	            int j=1;
//	            val =i;
//	            while(j<=i){
//	                System.out.print(val);
//	                j++;
//	                val++;
//	    
//	            }
//	            
//	            System.out.println();
//	            i++;
//	        }
	        int i=1;
	        while(i<=n){
	            int j=1;
	            while(j<=i){
	                System.out.print(i +j-1);
	                j++;

	            }
	            i++;
	            System.out.println();
	        }
	        }


}
