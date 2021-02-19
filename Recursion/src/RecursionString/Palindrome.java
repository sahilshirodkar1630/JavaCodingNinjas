package RecursionString;

import java.util.Scanner;

public class Palindrome {

	public static boolean isStringPalindrome(String input,int start) {
		// Write your code here
        if(input.length()==1){
            return true;
        }
        int end = input.length()-1;
        if(input.charAt(0)==input.charAt(end)){
        	System.out.println(input);
            boolean ans = isStringPalindrome(input.substring(start+1,end));
                return ans;
        }else{
            return false;
        }

	}
    public static boolean isStringPalindrome(String input ){
        boolean ans = isStringPalindrome(input,0);
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(isStringPalindrome(str));
	}

}
