import java.util.Scanner;

public class CheckRotation {
	
	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static int CheckRotation(int[] a) {

		int value =a[0];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<value){
                value = a[i];
                j=i;
                System.out.println(j);
            }
          
        }
        return j;
		//		int value =9;
//		int[] ans = new int[a.length];
//		for(int i=0;i<a.length;i++) {
//			ans[i] =a[i];
//		}
//		for(int  i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					int temp = a[i];
//					a[i]= a[j];
//					a[j]= temp;
//				}
//			}
//		}
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<ans.length;j++) {
//			if(a[i]==ans[j]){
//				value= j;
//				break;
//			}
//			
//			}
//			break;
//		}
//		return value;
		
	}
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = Takeinput();
		System.out.println(CheckRotation(array));

	}

}
