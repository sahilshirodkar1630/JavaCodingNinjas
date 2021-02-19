package Patterns1;

import java.util.Scanner;

public class Pattern1 {

//	4
//	4444
//	4444
//	4444
//	4444
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
        
            while(j<=n){
                System.out.print(n);
                j++;
            }
            i++;
            System.out.println();

        }
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
