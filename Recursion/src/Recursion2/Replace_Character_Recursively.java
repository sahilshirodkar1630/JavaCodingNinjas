package Recursion2;

import java.util.Scanner;

public class Replace_Character_Recursively {

//	Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
//	Do this recursively.
//	Input Format :
//	Line 1 : Input String S
//	Line 2 : Character c1 and c2 (separated by space)
//	Output Format :
//	Updated string
//	Constraints :
//	1 <= Length of String S <= 10^6
//	Sample Input :
//	abacd
//	a x
//	Sample Output :
//	xbxcd
//	
	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        String str = new  String();
        
        if(input.length()<1){
            return str;
        }
        
        if(input.charAt(0)==c1){
            str=str+Character.toString(c2);
        }else{
            str=str+input.substring(0,1);
        }
        String ans = str+replaceCharacter(input.substring(1),c1,c2);
        return ans;

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));
	}
}
