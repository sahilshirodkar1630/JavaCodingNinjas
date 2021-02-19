package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;int val=1;
        while(i<=n){
            int k=1;
            while(k<=n-i){
                System.out.print(" ");
                k++;
            }
             int j=1;
            while(j<=val){
                System.out.print("* ");
                j++;
            }
            val=val+2;
            System.out.println();
            i++;

        }
	}


}
