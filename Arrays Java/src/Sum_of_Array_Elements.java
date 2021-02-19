import java.util.Scanner;

public class Sum_of_Array_Elements {
	
	public static int Sum(int array[]) {
		int sum= 0;
		for(int i=0;i<array.length;i++) {
			sum =sum+array[i];
			}
		return sum;
		}
			
	public static int[] Takeinput(){
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=s.nextInt();
	        }
	        
	         return array;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=1;i<=t;i++) {		
		int[] array1 = Takeinput();
		   System.out.println(Sum(array1));
		}
	}

}
