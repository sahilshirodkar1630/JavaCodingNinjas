package Recursion2;

import java.util.Scanner;

public class Check_AB_Recursively {

//	Check AB
//	Send Feedback
//	Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
//	a. The string begins with an 'a'
//	b. Each 'a' is followed by nothing or an 'a' or "bb"
//	c. Each "bb" is followed by nothing or an 'a'
//	If all the rules are followed by the given string, return true otherwise return false.
//	Input format :
//	String S
//	Output format :
//	'true' or 'false'
//	Constraints :
//	0 <= |S| <= 1000
//	where |S| represents length of string S.
//	Sample Input 1 :
//	abb
//	Sample Output 1 :
//	true
//	Sample Input 2 :
//	abababa
//	Sample Output 2 :
//	false
	private static boolean checkABHelper(String input) {
		// Write your code here

       if(input.length()==0){
        return true;
       }
       if(input.charAt(0)=='b'){
           if(input.charAt(1)=='b'){
               boolean ans = checkABHelper(input.substring(2));
           return ans;
           }else{
               return false;
           }
       }
       boolean ans = checkABHelper(input.substring(1));
       return ans;
	}
	
   public static boolean checkAB(String input) {
       
       if(input.charAt(0)=='a'){
           boolean ans = checkABHelper(input.substring(1));
           return ans;
       }else{
           return false;
       }
   }
   public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}
}
