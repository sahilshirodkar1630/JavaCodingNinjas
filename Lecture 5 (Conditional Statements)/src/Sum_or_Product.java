import java.util.Scanner;

public class Sum_or_Product {
	
//	Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
//	If C is equal to -
//	 1, then print the sum
//	 2, then print the product
//	 Any other number, then print '-1' (without the quotes)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int temp=1;
		if(c==1) {
			temp=0;
			for(int i=1;i<n;i++) {
				temp = temp +i;
				
			}
			System.out.println(temp);
		}else if(c==2) {
			
			for(int i=1;i<n;i++) {
				temp = temp *i;
			}
			System.out.println(temp);
		}else {
			System.out.println("-1");
		}
		
		
	}

}
