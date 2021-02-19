import java.util.Scanner;

public class CheckPalindromeRecursive {

	
		// TODO Auto-generated method stub

//		Check Palindrome (recursive)
//		Send Feedback
//		Check whether a given String S is a palindrome using recursion. Return true or false.
//		Input Format :
//		String S
//		Output Format :
//		'true' or 'false'
//		Constraints :
//		0 <= |S| <= 1000
//		where |S| represents length of string S.
//		Sample Input 1 :
//		racecar
//		Sample Output 1:
//		true
//		Sample Input 2 :
//		ninja
//		Sample Output 2:
//		false
		
		public static boolean isStringPalindrome(String input,int start,int end) {
			// Write your code here
	        if(input.length()<=1){
	            return true;
	        }

	        if(input.charAt(0)==input.charAt(end-1)){
	            boolean ans = isStringPalindrome(input.substring(start+1,end-1));
	                return ans;
	        }else{
	            return false;
	        }

		}
	    public static boolean isStringPalindrome(String input ){
	        boolean ans = isStringPalindrome(input,0,input.length());
	        return ans;
	    }
	    public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			System.out.println(isStringPalindrome(input));
		}

}
