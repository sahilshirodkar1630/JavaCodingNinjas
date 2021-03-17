import java.util.Scanner;

public class Print_Subsequences {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		 printSubsequences(str);
		
		
		
	}

	private static void printSubsequences(String str) {
		// TODO Auto-generated method stub
		printSubsequences(str, "");
	}
	
	private static void printSubsequences(String str,String output) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(output);
			return;
		}
		printSubsequences(str.substring(1),output);
		printSubsequences(str.substring(1),output+str.charAt(0));
		
	}
}
