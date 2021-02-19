package Pattern2;
import java.util.Scanner;

public class Pattern6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();


//         *
//        ***
//       *****
//        ***
//         *
        int i = 1;
        while(i<=n/2+1) {
        	int j =1;
        	while(j<=n/2+1-i) {
        	System.out.print(" ");
        	j++;
        	}
        	j=1;
        	while(j<=i) {
        		System.out.print("*");
        		j++;
        	}
        	j=1;
        	while(j<=i-1) {
        		System.out.print("*");
        		j++;
        	}
        	i++;
        	System.out.println();
        }
        i=1;
        while(i<=n/2) {
        	int j=1;
        	while(j<=i) {
        		System.out.print(" ");
        		j++;
        	}
        	j=1;
        	while(j<=n/2+1-i) {
            	System.out.print("*");
            	j++;
            	}
        	j=1;
        	while(j<=n/2-i) {
        		System.out.print("*");
        		j++;
        	}
        	System.out.println();
        	i++;
        	
        }
        
    
        
        
        
//        	i=1;
//        while(i<=n/2+1 ) {
//        	int j =1;
//        	while(j<=n/2-i+1) {
//        		System.out.print(" ");
//        	j++;
//        	}
//        	j=1;
//        	while(j<=i) {
//        		System.out.print("*");
//        		j++;
//        	}
//        	j=1;
//        	while(j<=i-1) {
//        		System.out.print("*");
//        		j++;
//        	}
//        	
//        	i++;
//        	System.out.println();
//        	
//        }
//        i=1;
//        while(i<=n/2) {
//        	int j=1;
//        	while(j<=i) {
//        		System.out.print(" ");
//        		j++;
//        	}
//        	j=1;
//        	while(j<=n/2-i+1) {
//        		System.out.print("*");
//        		j++;
//        	}
//        	j=1;
//        	while(j<=n/2-i) {
//        		System.out.print("*");
//        		j++;
//        	}
//        	System.out.println();
//        	i++;
//        }
        
	}


}
