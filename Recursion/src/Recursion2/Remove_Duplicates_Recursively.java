package Recursion2;

import java.util.Scanner;

public class Remove_Duplicates_Recursively {

//	Remove Duplicates Recursively
//	Send Feedback
//	Given a string S, remove consecutive duplicates from it recursively.
//	Input Format :
//	String S
//	Output Format :
//	Output string
//	Constraints :
//	1 <= |S| <= 10^3
//	where |S| represents the length of string
//	Sample Input 1 :
//	aabccba
//	Sample Output 1 :
//	abcba
//	Sample Input 2 :
//	xxxyyyzwwzzz
//	Sample Output 2 :
//	xyzwz
	
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

        String ans = removeConsecutiveDuplicates(s,0,' ');
        return  ans;
        
	}
    public static String removeConsecutiveDuplicates(String input,int  start,char val) {
		// Write your code here
        String str = new String();
        if(input.length()<1){
           
            return str;
        }
        
        if(input.length()==1){ 
             if(input.charAt(0)==val){
                 return str;
             }
            str=str+input.substring(0,1);
         return str;    
        }
        
        if(input.charAt(0)==input.charAt(1)){
            if(input.charAt(0)==val){
                String ans = str+removeConsecutiveDuplicates(input.substring(start+2),0,input.charAt(0));
             return ans;
            }
            str=str+input.substring(0,1);
            String ans = str+removeConsecutiveDuplicates(input.substring(start+2),0,input.charAt(0));
            return ans;
            
        }else{
            if(input.charAt(0)==val){
                String ans = str+ removeConsecutiveDuplicates(input.substring(start+1),0,input.charAt(0));
            return ans;
            }
            str=str+input.substring(0,1);
            String ans = str+ removeConsecutiveDuplicates(input.substring(start+1),0,input.charAt(0));
            return ans;
        }
        
        
	}
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
    }
}
