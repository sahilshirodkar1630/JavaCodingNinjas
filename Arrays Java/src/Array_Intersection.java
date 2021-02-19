import java.util.Scanner;

public class Array_Intersection {
	
	public static int[] Takeinput(int n){
		 Scanner sc = new Scanner(System.in);
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}

	 public static void intersections(int array1[], int array2[]) {
	    	//Your code goes here
		 int value=0;
		 for(int i=0;i<array1.length;i++) {
				for(int j=0;j<array2.length;j++) {
					
//					System.out.print(array1[i]+""+array2[j]+" ");
				
					if(array1[i]==array2[j]) {
							System.out.print(array1[i]+" ");
							array2[j]=-1000;
	                        break;
	                        }
					}	
				}
					
	 }
		



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt();
		
	        int array1[] = new  int[n];
	        for(int i=0;i<n;i++) {
	        	
	         array1[i]=sc.nextInt();
	        }
	        
	       
		 int m = sc.nextInt();
		 int array2[] = new  int[m];
	        for(int i=0;i<m;i++) {
	         array2[i]=sc.nextInt();
	        }
		
		intersections(array1, array2);
		

	}

}
