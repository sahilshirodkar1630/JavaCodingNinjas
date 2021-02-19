import java.util.Scanner;

public class Reverse_String_Word_Wise {

//	Welcome to Coding Ninjas
	public static String reverseWordWise(String input) {
		// Write your code here
		
			
		String str = new String("");
		int i=input.length();;
		int n= input.length()-1;
		while(n>=0) {
			if(input.charAt(n)==' ') {
				
					str= str+input.substring(n+1,i);
					str = str.concat(" ");
					i=n;

				}else if(n==0) {
					str= str+input.substring(n,i);
				}
			n--;
			}
		input= str;
		return input;
	
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseWordWise(str));
		System.out.println(str);
	}

}
