package Patterns;

import java.util.Scanner;

public class Pattern6 {
	
//	5
//	ABCDE
//	ABCDE
//	ABCDE
//	ABCDE
//	ABCDE

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print((char)('A'+j-1));
                j++;
            }
            i++;
            System.out.println();
        }
	}

}
