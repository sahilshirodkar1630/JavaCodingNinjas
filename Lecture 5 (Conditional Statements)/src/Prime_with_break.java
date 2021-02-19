import java.util.Scanner;
public class Prime_with_break {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=2;i<=n;i++) {
			boolean divided = false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					divided = true;
					break;
				}
			}
			if(!divided) {
				System.out.println(i);
			}
		}

	}

}
