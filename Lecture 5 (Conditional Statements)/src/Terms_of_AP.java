import java.util.Scanner;

public class Terms_of_AP {
//		
//	Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
//	Input format :
//	Integer x
//	Output format :
//	Terms of series (separated by space)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int count =1;
//		for(int i=1;i<1000;i++) {	
//			int c = 3*i+2;
//			if(c%4!=0) {
//				System.out.print(c+ " ");
//				count++;
//			}
//			if(count>n) {
//				break;
//			}
//		}
//		Alternatuve Aproach
//		
		int count =1,current =1;
		while(count<=n) {
			int num = 3*current+2;
			if(num%4!=0) {
				System.out.print(num+" ");
				count++;
			}
			current ++;
		}
		
	}
}


