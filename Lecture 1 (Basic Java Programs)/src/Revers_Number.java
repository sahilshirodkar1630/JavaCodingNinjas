import java.util.Scanner;

public class Revers_Number {

	public static  void main(String args) {
		Scanner sc = new Scanner(System.in) ;
		int x = sc.nextInt();
		int ans =0;
		while(x>0) {
			int n=x%10;
			x=x/10;
			ans = ans*10+n;
		}
			
		
	}
}
