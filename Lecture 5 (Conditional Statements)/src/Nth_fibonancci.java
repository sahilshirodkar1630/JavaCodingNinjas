import java.util.Scanner;
public class Nth_fibonancci {
	
//	
//	Nth term of fibonacci series F(n) is calculated using following formula -
//    F(n) = F(n-1) + F(n-2), 
//    Where, F(1) = F(2) = 1
//    Provided N you have to find out the Nth Fibonacci Number.
//    Input Format :
//    	Integer n
//    	Output Format :
//    		Nth Fibonacci term i.e. F(n)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a=0,b=1;
		int c=1,fib=0;
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			if(i==n) {
		System.out.print(a);
			}
		c=a+b;
		}
		
	

	}

}
