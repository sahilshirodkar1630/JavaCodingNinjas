package Functions;
import java.util.Scanner;
public class NCR {
	public static int fact(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans = ans*i;
		}
		 
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r = sc.nextInt();
		int num =fact(n);
	
		int den1=fact(r);
	
		int den2= fact(n-r);
	
		int c=num/(den1*den2);
		System.out.println(c);

	}

}
