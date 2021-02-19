package RecursionString;

import java.util.Scanner;

public class PairStar {

	
//	Pair star
//	Send Feedback
//	Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
//	Input format :
//	String S
//	Output format :
//	Modified string
//	Constraints :
//	0 <= |S| <= 1000
//	where |S| represents length of string S.
//	Sample Input 1 :
//	hello
//	Sample Output 1:
//	hel*lo
//	Sample Input 2 :
//	aaaa
//	Sample Output 2 :
//	a*a*a*a
	public static String addStars(String s,int start) {
		// Write your code here
        String str= new String();
        
        if(s.length()==1){
            str=str+s.substring(0,1);
            return str ;
        }
        if(s.charAt(0)==s.charAt(1)){
            str=str+s.substring(0,1);
            str=str+"*";
        }else{
            str=str+s.substring(0,1);
        }
        String ans= str+addStars(s.substring(start+1),0);
        return ans;

	}
    public static String addStars(String s) {
		// Write your code here

        String ans = addStars(s,0);
        return ans;
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}
}
