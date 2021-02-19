import java.util.Scanner;

public class Find_Duplicate {


	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}

	public static int Duplicate(int[] array) {
		boolean isDuplicate = false;;
		int u=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					isDuplicate=true;
				}
			}
//			System.out.println();
			if(isDuplicate) {
				u=array[i];
				break;
			}
		}
		return u;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = Takeinput();
		System.out.println(Duplicate(array));
		
		
	}

}
