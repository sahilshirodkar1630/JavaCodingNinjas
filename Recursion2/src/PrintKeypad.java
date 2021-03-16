import java.util.Scanner;

public class PrintKeypad {

	
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
	
	public static void printKeypad(int n,String s){
		// Write your code here
		if(n==0) {
			System.out.println(s);
			return;
		}
		String[] dictionary = digit(n%10);
		
			printKeypad(n/10,dictionary[0]+s);
			printKeypad(n/10,dictionary[1]+s);
			printKeypad(n/10,dictionary[2]+s);
			if(dictionary.length==4) {
				printKeypad(n/10,dictionary[3]+s);
			}
		
	}


	public static void printKeypad(int n){
		// Write your code here
		printKeypad(n, "");
		return;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		printKeypad(input);
	}

}
