import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class ReturnallCodes_String {

	private static char getchar(int Digit) {
		// TODO Auto-generated method stub
		return (char)(96+Digit);
	}
	public static String[] getCode(String input) {
		//Basecase
		if(input.length()==0) {
			String[] output = {""};
			return output;
		}
		
		int firstDigit = (input.charAt(0) -'0');
		String[] firstOutput = getCode(input.substring(1));
		int firstTwoDigit =0;
		String[] secondOutput = new String[0];
		if(input.length()>=2) {
			firstTwoDigit = (input.charAt(0) -'0')*10 + (input.charAt(1)-'0');
			if(firstTwoDigit>=10 && firstTwoDigit<=26) {
				secondOutput = getCode(input.substring(2));
			}
		}
		String Output[] = new String[firstOutput.length+secondOutput.length];
		int k=0;
		for(String s : firstOutput) {
			char firstDigitChar = getchar(firstDigit);
			Output[k]= firstDigitChar+s;
			k++;
		}
		
		for(String s : secondOutput) {
			char firstTwoDigitChar = getchar(firstTwoDigit);
			Output[k] =  firstTwoDigitChar+s;
			k++;
		}
		
		return Output;
		
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
