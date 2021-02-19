package RecursionString;

import java.util.Scanner;

public class Subsequences {
	public static String[]  findSubsequences(String str) {
		
		if(str.length()==0) {
			String ans[] = {""};
			return ans;
		}
		String smallAns[]= findSubsequences(str.substring(1));
		String answer[]=new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			answer[i]= smallAns[i];
		}
		for(int i=0;i<smallAns.length;i++) {
			answer[i+smallAns.length]= str.charAt(0)+smallAns[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String ans[]= findSubsequences(str);
		
		for(int i=0;i<ans.length;i++) {
			
			System.out.println(ans[i]);
		}
		
	}

}
