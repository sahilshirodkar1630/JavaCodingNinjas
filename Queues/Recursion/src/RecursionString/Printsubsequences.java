package RecursionString;

import java.util.Scanner;

public class Printsubsequences {
	public static void printSubseq(String input,String output) {
		
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		printSubseq(input.substring(1),output);
		printSubseq(input.substring(1),output+input.substring(0,1));
	}
public static void printSubseq(String input) {
	
	printSubseq(input, "");
	return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		printSubseq(str);
	}

}
