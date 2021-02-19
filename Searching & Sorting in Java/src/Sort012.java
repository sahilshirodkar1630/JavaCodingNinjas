import java.util.Scanner;

public class Sort012 {
//	5
//	2 0 2 1 0

	public static void Sort102(int a[]){
	    int i=0;
	    int j=0;
	    int temp =0;
	    int k=a.length-1;
	    while(i<=k){
	        if (a[i]==0){
	            temp =a[i];
	            a[i] = a[j];
	            a[j] = temp;
	            j++;
	            i++;
	        } else if(a[i]==2){
	            temp =a[i];
	            a[i] = a[k];
	            a[k] = temp;
	            k--;
	        }
	        else{
	            i++;
	        }
	    }
	}
	
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}
    
	public static void main (String[] args) {
		//code
		 Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
              int n = sc.nextInt();
               int a1[] = new  int[n];
	        for(int j=0;j<=n-1;j++) {
	         a1[j]=sc.nextInt();
	        }
             Sort102(a1);
             PrintArray(a1);
        }
	}
}
