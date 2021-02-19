import java.util.Scanner;

public class Find_Unique {

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
	public static int Unique(int[] arr) {
		
		 int ans[]= new int[256];
	        for(int i=0;i<arr.length;i++){
	           int  value = ans[(char)(arr[i])];
	           
	            ans[(char)(arr[i])]= value+1;
	            
	        }
	        
	        int unique = 0;
	        for(int i=0;i<ans.length;i++){
	            if(ans[i]==1){
	                unique=i;
	                break;
	            }
	        }
	        return unique;
//		boolean isUnique = true;
//		int u=0;
//		for(int i=0;i<array.length;i++) {
//			isUnique = true;
//			for(int j=0;j<array.length;j++) {
//				if(array[i]==array[j]) {
//					if(i==j) {
//						continue;
//					}else {
//					isUnique =false;
//					}
//				}
//			}
////			System.out.println();
//			if(isUnique) {
//				u=array[i];
//				break;
//			}
//		}
//		return u;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= Takeinput();
//		Unique(array);
		System.out.println(Unique(array));
//		PrintArray(array);
	}

}
