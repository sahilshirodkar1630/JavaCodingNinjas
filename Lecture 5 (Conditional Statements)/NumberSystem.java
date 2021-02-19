package NumberSystem;

import java.util.Scanner;

public class NumberSystem {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				class Number {
				int number;
				public boolean istraingular() {
					int x=1;
					int traingularnumber=1;
					while(traingularnumber<number) {
						 x = x+traingularnumber;
						traingularnumber++;
						if(x==number) {
							
							return true;
						}
					}
				
					return false;
					
				}
				public boolean isSquare() {
					
					int x=0;
					int squarenumber=1;
					while(squarenumber<number) {
						x=squarenumber*squarenumber;
						if(x==number) {
							
							return true;
						}
						squarenumber++;
					}
					
					return false;
				}
				}
				System.out.println("Enter a number");
				Scanner sc = new Scanner(System.in);
				int n=sc.nextInt();
			
				Number myNumber= new Number();
				myNumber.number=n;
			
				if(myNumber.isSquare()) {
					
					
				}
			}
			

}
