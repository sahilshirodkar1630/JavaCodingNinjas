import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		long ans=0;
		long i=1;
		while(n>0) {
			temp =n%2;
			n=n/2;
			ans = ans+temp*i;
			i=i*10;
			
		}
		System.out.print(ans);

	}

}
