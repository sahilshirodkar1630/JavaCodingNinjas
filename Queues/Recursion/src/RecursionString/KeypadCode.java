package RecursionString;
import java.util.Scanner;

public class KeypadCode {
    
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
		public static String[] keypad(int n){
			
	        if(n == 0) {
	            String[] ans = {""};
	            return ans;
	        }
	        
	        String remainDigit[] = keypad(n/10);
	        String lastDigit[] = helper(n % 10);
	        String myAns[] = new String[remainDigit.length * lastDigit.length];
	        int k = 0;
	        
	        for(int i = 0; i < remainDigit.length; i++) {
	            for(int j = 0; j < lastDigit.length; j++) {
	                
	                myAns[k] = remainDigit[i] + lastDigit[j];
	                k++;
	            }
	        }
	        
	        
	        return myAns;
	        

		}     
        
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String ans[]= keypad(n);
		
		for(int i=0;i<ans.length;i++) {
			
			System.out.println(ans[i]);
		}
	}

}
