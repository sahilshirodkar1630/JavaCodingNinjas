import java.util.Scanner;
import java.util.Stack;

public class Next_Largest_Element {

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
	 public static int[] nextLargerElement(int[] arr, int n) { 
	        // Your code here
	        
		 Stack<Integer> s= new Stack<Integer>();
		 for(int i=0;i<arr.length;i++) {
			 s.push(arr[i]);
		 }
		 int ans[]= new int[arr.length];
		 ans[0]= -1;
		 int lar= s.pop();
		 int prev = 0;
//		 ans[1]= lar
		 int k=1;
		 while(!s.isEmpty()) {
			 int val = s.pop();
			 if(val>lar) {
				 lar= val;
				 ans[k]= -1;
				 k++;
			 }else if (val<lar) {
				 if(val<prev) {
					 ans[k]= prev;
					 k++;
				 }else {
				 ans[k]= lar;
				 k++;
				 }
			 }
			 prev=val;
		 }
		 
		 ReverseArrayRec(ans);
		 return ans;
		 
	    } 
	 
	 public static void ReverseArrayRec(int a[]) {
				int i=0;
				int n=a.length-1;
				while(i<=n) {
					int temp = a[i];
					a[i] = a[n];
					a[n] = temp;
					i++;
					n--;
			}
				
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= Takeinput();
		int ans[]= nextLargerElement(arr, arr.length);
		PrintArray(ans);
	}

}
