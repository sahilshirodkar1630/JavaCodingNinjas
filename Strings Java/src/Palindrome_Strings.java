import java.util.Scanner;

public class Palindrome_Strings {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int i=0;
        int n= str.length()-1;
        boolean isPalind = true;
        while(i<=n){
            if(str.charAt(i)==str.charAt(n)){
                isPalind = true;
            }else{
                isPalind = false;
                break;
                
            }
            i++;
            n--;
            
        }
        return isPalind;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
		System.out.println(str);
	}

}
