import java.util.Scanner;

public class Sum_of_Two_ArrayNumbers {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	         return array;
  }
	
	public static void sumOfTwoArrays(int a1[], int a2[], int k[]) {
    	//Your code goes here
        int i = a1.length-1;
        int j = a2.length-1;
        int s= k.length-1;
        int sum =0;
        int carry=0;
        while(j>=0||i>=0){
        	if(j<0) {
        		 sum = a1[i]+0+carry;
        		if(sum>9){
                     carry= sum;
                      sum= sum%10;
                     carry = carry/10;
                     // System.out.println(sum+" sum "+carry+" carry");
                 }else {
                 	carry = 0;	
        	}
        	}else if(i<0) {
        		 sum = 0+a2[j]+carry;
        		if(sum>9){
                     carry= sum;
                      sum= sum%10;
                     carry = carry/10;
                     // System.out.println(sum+" sum "+carry+" carry");
                 }else {
                 	carry = 0;	
        	}
        	}else {
            sum = a1[i]+a2[j]+carry;
            if(sum>9){
                carry= sum;
                 sum= sum%10;
                carry = carry/10;
//                System.out.println(sum+" sum "+carry+" carry");
            }else {
            	carry = 0;
            }
        	}
            k[s]=sum;
            i--;
            j--;
            s--;
            // PrintArray(k);
        }
        while(i>=0) {
        	 sum = a1[i]+carry;
             if(sum>9){
                 carry= sum;
                  sum= sum%10;
                 carry = carry/10;
                 
             }else {
            	 carry=0;
             }
        	k[s]=sum;
        	i--;
        	s--;
        }
        while(j>=0) {
       	 sum = a2[j]+carry;
            if(sum>9){
                carry= sum;
                 sum= sum%10;
                carry = carry/10;
                
            }else {
           	 carry=0;
            }
       	k[s]=sum;
       	j--;
       	s--;
       }
        while(s>=0) {
    		k[s]= carry;
    		s--;
    	}
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
		int[] a1 = {6,9,8};
		
		int a2[] = {5,9,2};
		int[] k = new int[1 + Math.max(a1.length, a2.length)];
		sumOfTwoArrays(a1, a2, k);
		PrintArray(k);
		

	}

}
