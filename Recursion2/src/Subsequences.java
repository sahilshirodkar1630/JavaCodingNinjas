

import java.util.Scanner;

public class Subsequences {
	// Given a  String you have to return all subsequenses of that string
	
//	public static String[]  findSubsequences(String str) {
//		if(str.length()==0) {
//			String ans[] = {""};
//			return ans;
//		}
//		String smallAns[]= findSubsequences(str.substring(1));
//		String answer[]=new String[2*smallAns.length];
//		for(int i=0;i<smallAns.length;i++) {
//			answer[i]= smallAns[i];
//		}
//		for(int i=0;i<smallAns.length;i++) {
//			answer[i+smallAns.length]= str.charAt(0)+smallAns[i];
//		}
//		return answer;
//	}

	
	public static String[] findSubsequences(String str) {
		//Basecase
		if(str.length()==0) {
			String ans[] = {""};
			return ans;
		}
		
		String smallAns[] = findSubsequences(str.substring(1));
		String output[] = new String[smallAns.length*2];
		int i=0;
		// first put all elements of smallAns in output array
		for(;i<smallAns.length;i++) {
			output[i]= smallAns[i];
		}
		// then add the first char of string with all elements of smallAns Array in output array
		for(;i<output.length;i++) {
			output[i]= str.charAt(0)+smallAns[i-smallAns.length];
		}
		return output;
		
		
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
