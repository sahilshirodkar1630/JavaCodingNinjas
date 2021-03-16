import java.util.Scanner;

public class Return_Keypad_Code {

	/*
	Return Keypad Code
	
	Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
	Return empty string for numbers 0 and 1.
	Note :  1. The order of strings are not important.
			2. Input and output has already been managed for you.
			 You just have to populate the output array and return the count of elements populated in the output array.
	
	Input Format :
		Integer n
	Output Format :
		All possible strings in different lines
	Constraints :
		1 <= n <= 10^6
	Sample Input:
	23
	Sample Output:
	ad
	ae
	af
	bd
	be
	bf
	cd
		ce
		cf

	
	*/
public static String[] digit(int n) {
		
		String[] s= {" "};
		if(n<=1 || n>10) {
			return s;
		}
		if(n==2) {
			String[] dic = {"a","b","c"};
			return dic;
		}else if(n==3) {
			String[] dic = {"d","e","f"};
			return dic;
		}else if(n==4) {
			String[] dic = {"g","h","i"};
			return dic;
		}else if(n==5) {
			String[] dic = {"j" , "k" , "l"};
			return dic;
		}else if(n==6) {
			String[] dic = {"m" , "n" , "o"};
			return dic;
		}
		else if(n==7) {
			String[] dic =  {"p" , "q" , "r", "s"};
			return dic;
		}
		else if(n==8) {
			String[] dic = {"t" , "u" , "v"};
			return dic;
		}
		else if(n==9) {
			String[] dic =  {"w" , "x" , "y", "z"};
			return dic;
		}
		return s;
	}



	public static String[] keypad(int n) {
		if(n==0) {
			String[] output = {""};
			return output;
		}
		
		String[] smallAns = keypad(n/10);
		String[] dictionary = digit(n%10);
		String[] output = new String[smallAns.length*dictionary.length];
		int k=0;
		for(int d=0;d<dictionary.length;d++) {
			for(int i=0;i<smallAns.length;i++) {
				output[k] = smallAns[i]+dictionary[d];
				k++;
			}
		}
		return output;

	}
	
//	public static String[] keypad(int n) {
//		
//		if(n==0) {
//			String[] a = {""};
//			return a;
//		}
//		String last[] = digit(n%10);
//		String dig[] = keypad(n/10);
//		String newans[] = new String[dig.length*last.length];
//		
//		int k=0;
//		
//		for(int i=0;i<dig.length;i++) {
//			for(int j=0;j<last.length;j++) {
//				newans[k] = dig[i]+last[j];
//				k++;
//			}
//		}
//		
//		return newans;
//		
//	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
