package RecursionString;
import java.util.Scanner;
public class PrintKeypad {
	
	
	public static void printKeypad(int input,String s){
		if(input==0){
			System.out.println(s);
			return;
		}
		String help[] = helper(input%10);
		if(help.length==3) {
			printKeypad(input/10,help[0]+s);
			printKeypad(input/10,help[1]+s);
			printKeypad(input/10,help[2]+s);
		}else {
			printKeypad(input/10,help[0]+s);
			printKeypad(input/10,help[1]+s);
			printKeypad(input/10,help[2]+s);
			printKeypad(input/10,help[3]+s);
		}
		
	}
	public static void printKeypad(int input){
		// Write your code here
		printKeypad(input, "");
		return;
	}
	 public static String[] helper(int n) {
	        
	        if(n <= 1 || n > 9) {
	            String[] empty = {""};
	            return empty;
	        }
	        
	        else if(n == 2) {
	            String[] output = {"a" , "b", "c"};
	            return output;
	        }
	        else if(n == 3) {
	            String[] output = {"d" , "e" , "f"};
	            return output;
	        }
	        else if(n == 4) {
	            String[] output = {"g", "h", "i"};
	            return output;
	        }
	        else if(n == 5) {
	            String[] output = {"j", "k", "l"};
	            return output;
	        }
	        else if(n == 6) {
	            String[] output = {"m", "n" , "o"};
	            return output;
	        }
	        else if(n == 7) {
	            String[] output = {"p", "q", "r", "s"};
	            return output;
	        }
	        else if(n == 8) {
	            String[] output = { "t", "u", "v"};
	            return output;
	        }
	        else {
	            String[] output = {"w", "x", "y", "z"};
	            return output;
	        }
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		printKeypad(n);

	}

}
