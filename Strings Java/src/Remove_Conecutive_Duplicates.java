import java.util.Scanner;

public class Remove_Conecutive_Duplicates {
//	Remove Consecutive Duplicates
//	Send Feedback
//	For a given string(str), remove all the consecutive duplicate characters.
//	Example:
//	Input String: "aaaa"
//	Expected Output: "a"
//
//	Input String: "aabbbcc"
//	Expected Output: "abc"

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String ans = new String();
        ans = str.substring(0,1);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                continue;
            }else{
                ans = ans+str.substring(i,i+1);
            }
        }
              return ans;
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans =removeConsecutiveDuplicates(str);
		System.out.println(ans);
	}

}
