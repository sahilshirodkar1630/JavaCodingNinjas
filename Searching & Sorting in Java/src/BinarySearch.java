import java.util.Scanner;

public class BinarySearch {

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

	public static int binarySearch(int[] array, int x) {
    	//Your code goes here
        int start =0;
        int end = array.length-1;
        int mid = (start+end)/2;
        while(start<end){
            System.out.println(start+" "+mid+" "+end+" ");
        if(x==array[mid]){

            return mid;
        }else if(x>array[mid]){
            start=mid+1;
            mid = (start+end)/2;
             if(x==array[mid]){
                 return mid;
         		}
        }else if(x<array[mid]){
            start=0;
            end = mid-1;
            mid = (start+end)/2;
             if(x==array[mid]){
                 return mid;
         		}
        }
        }
            return -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[]= Takeinput();
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        System.out.println(binarySearch(array1, x));
		
	
		

	}
}
