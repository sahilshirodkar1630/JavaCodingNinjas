import java.util.Scanner;

public class Reverse_each_Word {

	public static String Reverse(String str1,int start,int end) {
		 int i=end;
		String ans = new String();
		while(i>=start) {
			ans=ans +str1.substring(i,i+1);
			i--;
		}
		return ans;
		
	}
	public static String reverseEachWord(String str) {
		//Your code goes here
		int j=0;
		String ans = new String();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== ' ') {
				ans = ans+Reverse(str,j,i-1);
				ans= ans.concat(" ");
				j=i+1;
			}
			if(i==str.length()-1) {
				ans = ans+Reverse(str,j,i);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseEachWord(str));

	}

}
