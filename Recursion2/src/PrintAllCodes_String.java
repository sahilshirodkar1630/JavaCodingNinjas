import java.util.Scanner;

public class PrintAllCodes_String {
/*
	
	Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
			Note : The order of codes are not important. Just print them in different lines.
			Input format :
			A numeric string S
			Output Format :
			All possible codes in different lines
			Constraints :
			1 <= Length of String S <= 10
			Sample Input:
			1123
			Sample Output:
			aabc
			kbc
			alc
			aaw
			kw
	
	
*/
	private static char getChar(int n) {
		return (char)(96+n);
	}
	public static void printAllPossibleCodes(String input) {
		// Write your code here
		printAllPossibleCodes(input,"");
		
	}
	
	private static void printAllPossibleCodes(String input, String output) {
		// TODO Auto-generated method stub
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		int firstDigit = input.charAt(0)-'0';
		printAllPossibleCodes(input.substring(1),output+getChar(firstDigit));
		if(input.length()>1) {
			int firstTwoDigit = (input.charAt(0)-'0') * 10 + (input.charAt(1)-'0');
			if(firstTwoDigit>=10 && firstTwoDigit<=26) {
				printAllPossibleCodes(input.substring(2),output+getChar(firstTwoDigit));
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		printAllPossibleCodes(input);
	}

}
