package Patterns;

import java.util.Scanner;

public class Pattern7 {

//	5
//	ABCDE
//	BCDEF
//	CDEFG
//	DEFGH
//	EFGHI

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
            char StartingChar = (char)('A'+i-1);
            while(j<=n){
                System.out.print(StartingChar);
                StartingChar=(char)(StartingChar+1);
                j++;
            }
            i++;
            System.out.println();
        }
	}

}
