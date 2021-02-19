package while_loop;

import java.util.Scanner;

public class Sum_of_N_EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i=1,sum=0;
		while (i<=n) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
