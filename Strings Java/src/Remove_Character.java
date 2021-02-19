import java.util.Scanner;

public class Remove_Character {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        String ans = new String();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                continue;
            }else{
                ans =ans+str.substring(i,i+1);
            }
        }
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String character = sc.next();
//		char ch = character.charAt(0);
//		String ans =removeAllOccurrencesOfChar(str, ch);
		
		char ans= 97;
				System.out.println(ans);
		
	}

}
