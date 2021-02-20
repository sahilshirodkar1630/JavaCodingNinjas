import java.util.Scanner;

public class Java_LoopsII {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int temp=1;
	                 int z=0;
	                 int sum=0;
	                 int s=0;
	                 int temp2;
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            while(z<n) {
	                        temp =temp *2;
	                        s=a+1*b;
	                        temp2=sum+s;
	                        System.out.print(temp2+" ");
	                        sum = sum +temp*b;
	                        
	                        z++;
	                    }
	                    System.out.println();
	        }
	        in.close();
	    }
}
