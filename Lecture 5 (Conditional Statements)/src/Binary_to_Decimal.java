import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int temp=0,i=1;
//		int val=0,total=0;
//		while(n>0) {
//			temp = n%10;
//			n=n/10;
//			val=temp*i;
//			total=total+val;
//			i=i+i;
//		}
//		System.out.println(total);
		
		
		int i=1;
		int val=0,total=0;
		while(n>0){
		int temp =n%10;
		n=n/10;
		val = temp*i;
		total= total +val;
		i=i+i;
		}
		System.out.println(total);

	}

}
