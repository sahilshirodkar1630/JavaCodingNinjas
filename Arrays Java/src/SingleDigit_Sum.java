import java.util.Scanner;

public class SingleDigit_Sum {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static int sum(int arr[])
	{
         //Write code here
//        int ans =0;
//        int sum=0;
//        int n=0;
//        for(int i=0;i<arr.length;i++){
//            sum= sum +arr[i];
//            System.out.println(sum);
//        }
//        System.out.println(sum);
//       
//        n= sum%10;
//        sum = sum/10;
//        ans = sum+n;
////             System.out.print(" "+ans);
//            
		int sum =0;for(int n:arr) {
			sum+=n;
			if(sum>=10) {
				int tempsum = sum%10;
				sum=sum/10;
				tempsum +=sum;
				sum= tempsum;
			}
		}
    
        return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= Takeinput();
		System.out.println(sum(a));
	}

}
