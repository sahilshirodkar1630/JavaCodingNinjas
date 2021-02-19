import java.util.Scanner;

public class All_consecutive_elements {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static int Duplicate(int[] a) {
		int Answer =0;
		int ans[] = new int [256];
        for(int i=0;i<a.length;i++){
            int value = a[i];
            ans[value]++;
        }
        for(int i=0;i<ans.length;i++) {
        	if(ans[i]>1) {
        	 Answer = i;	
        	}
        }
//        PrintArray(ans);
        return Answer;
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
		int a[]= Takeinput();
		System.out.println(Duplicate(a));
		

	}

}
