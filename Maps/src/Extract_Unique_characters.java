import java.util.HashMap;
import java.util.Set;

public class Extract_Unique_characters {

//	Extract Unique characters
//	Send Feedback
//	Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.
//	Input format:
//	The first and only line of input contains a string, that denotes the value of S.
//	Output format :
//	The first and only line of output contains the updated string, as described in the task.
//	Constraints :
//	0 <= Length of S <= 10^8
//	Time Limit: 1 sec
//	Sample Input 1 :
//	ababacd
//	Sample Output 1 :
//	abcd
//	Sample Input 2 :
//	abcde
//	Sample Output 2 :
//	abcde

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        HashMap<Character,Integer> maps = new HashMap<Character, Integer>();
        String output ="";
        for(int i=0;i<str.length();i++) {
        	if(!maps.containsKey(str.charAt(i))) {
        		maps.put(str.charAt(i), 1);
        		output+=str.charAt(i);
        	}
        }
         return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniqueChar("abcabcabcd"));
	}

}
