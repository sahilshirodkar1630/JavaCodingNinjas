import java.util.Scanner;

public class Replace_Character_Recursively {

	/*
	Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
	Do this recursively.
	Input Format :
		Line 1 : Input String S
		Line 2 : Character c1 and c2 (separated by space)
	Output Format :
		Updated string
		Constraints :
		1 <= Length of String S <= 10^6
	Sample Input :
		abacd
		a x
	Sample Output :
		xbxcd
	
	*/
	
//	public static String replaceCharacter(String str, char a, char b, int si) {
//		
//		if(str.length() ==0){
//			return "";
//		}
//		
//		if(str.charAt(0) !=a) {
//			return str.charAt(0)+replaceCharacter(str.substring(si+1),a,b);
//		}
//		return b+replaceCharacter(str.substring(si+1), a, b);
//		
//	}
//	
//	public static String replaceCharacter(String str, char a, char b) {
//		
//        return replaceCharacter(str, a, b, 0);
//
//	}
//	
public static String replaceCharacter(String str, char a, char b) {
		
        return replaceCharacter(str, a, b, 0);

	}
	private static String replaceCharacter(String str, char a, char b, int start) {
	// TODO Auto-generated method stub
		if(start>=str.length()) {
			return "";
		}
		if(str.charAt(start)==a) {
			return b+replaceCharacter(str, a, b, start+1);
			
		}
		return str.charAt(start)+replaceCharacter(str, a, b, start+1);
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));
	}

}
