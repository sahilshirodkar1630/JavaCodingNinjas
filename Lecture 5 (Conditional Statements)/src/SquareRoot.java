import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			int ans = i*i;
				if(ans<n) {
					
				}else if(ans==n){
					System.out.println(i);
					break;
				}else {
					System.out.println(i-1);
					break;
				}
		}
	}

}
