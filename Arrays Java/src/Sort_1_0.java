import java.util.Scanner;

public class Sort_1_0 {

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
	
	public static void Sort(int[] array) {
		
		int value=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
            	
                int temp=array[value];
                array[value]=array[i];
                array[i]=temp;
                value+=1;
            }
        }
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= Takeinput();
		Sort(array);
		PrintArray(array);
		
	}

}
