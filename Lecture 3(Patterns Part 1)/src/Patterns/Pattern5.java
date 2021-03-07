package Patterns;

import java.util.Scanner;

public class Pattern5 {

//	4
//	1
//	21
//	321
//	4321

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
            while(j<=i){
                System.out.print(i-j+1);
                j++;
            }
            i++;
            System.out.println();
        }
	}
}
