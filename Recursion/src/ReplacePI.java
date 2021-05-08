

import java.util.Scanner;

public class ReplacePI {
	
//	Replace pi (recursive)
//	Send Feedback
//	Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
//	Sample Input 1 :
//	xpix
//	Sample Output :
//	x3.14x
//	Sample Input 2 :
//	pipi
//	Sample Output :
//	3.143.14
//	Sample Input 3 :
//	pip
//	Sample Output :
//	3.14p
	public static String replace(String input,int start){
		// Write your code here
      String str= new String();
        if(input.length()<1){
            return str;
        }
       if(input.charAt(0)=='p'){
    	   if(input.length()==1) {
    		   str=str+input.substring(0,1);
               String ans = str+replace(input.substring(start+1),0);
          return ans;
    	   }
           if(input.charAt(1)=='i'){
        	   if(input.length()==2) {
        		   str=str+"3.14";
        		   return str;
        	   }
               str=str+"3.14";
               String ans = str+ replace(input.substring(start+2),0);
               return ans;
           }else{
               str=str+input.substring(0,1);
                    String ans = str+replace(input.substring(start+1),0);
               return ans;
           }
       }else{
            str=str+input.substring(0,1);
            String ans = str+replace(input.substring(start+1),0);
               return ans;
       }

	}
    public static String replace(String input){
		// Write your code here
        String ans = replace(input,0);
        return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(replace(str));
	}

}
