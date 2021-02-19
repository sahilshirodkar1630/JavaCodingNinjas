import java.util.Scanner;
public class Character_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//		1, if the character is an uppercase alphabet (A - Z)
//		0, if the character is a lowercase alphabet (a - z)
//		-1, if the character is not an alphabet
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		char c = s.charAt(0);
		if(c>='A'&& c<='Z') {
			System.out.println("1");
			
		}else if(c>='a'&& c<='z') {
			System.out.println("0");
		}else {
			System.out.println("-1");
		}

	}

}
