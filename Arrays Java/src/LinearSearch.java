import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int array[],int x) {
		int s=0;
		for(int i=0;i<array.length;i++) {
			if(array[i] == x) {
				s=i;
				break;
			}
			}
		return s;
		
	}
	
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
		int x= sc.nextInt();
		   System.out.println(linearSearch(array1, x));
		}
	}

}
