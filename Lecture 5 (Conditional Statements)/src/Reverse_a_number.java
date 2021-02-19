import java.util.Scanner;
public class Reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rem =0;
		int temp =0;
		while(n>0) {
//
		temp = n%10;
		n=n/10;
		rem = rem*10+temp;
//		if(temp==0){
//			continue;
//		}
//		System.out.println(temp);
		}
		System.out.println(rem);
		while(rem>0) {
		if(rem%10==0) {
			rem=rem%10;
		}else {
			break;
		}
		System.out.println(rem);
		}
	}
}
