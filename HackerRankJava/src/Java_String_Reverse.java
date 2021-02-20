import java.util.Scanner;

public class Java_String_Reverse {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        // System.out.println("Enter a String");
	        Scanner sc = new Scanner(System.in);
	        String a=sc.nextLine();
	        boolean result =true;
	        int first=0;
	        int last=a.length()-1;
	            while(first<=last){
	                if(a.charAt(first)!=a.charAt(last))
	                {
	                    System.out.println("No");
	                    return;
	                }
	                first++;
	                last--;
	            }
	            System.out.println("Yes");
	        
	    }
}
