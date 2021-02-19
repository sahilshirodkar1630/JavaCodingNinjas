import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int value =n,og=n;
		int num=0,temp=0;
		
		while(n>0) {
			temp =n%10;
			n=n/10;
			num++;
		}
		temp=0;
		int total=0;
		while(value>0) {
			temp=value%10;
			int j=1,r=1;
			while(j<=num) {
				r=r*temp;
				
				j++;
			}
		total = total+r;
		value=value/10;
		}
		if(og==total) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
	}

}
