package RecursionString;

import java.util.Scanner;

public class ReturnallCodes {

    private static char toChar(int n){
         int y = 'a'+n-1;
		char ans =(char)(y);
        return ans;
    }
	// Return a string array that contains all possible codes
    public static  String[] getCode(String input){
        char a=' ';
        return getCode(a,input);
        
    }
    
	public static  String[] getCode(char val,String input){
		// Write your code here
		if(input.length()==0){
            String str[]= new String[1];
            str[0]=Character.toString(val);
            for(int i = 0; i < str.length; i++) {
    			System.out.println(str[i]);
    		}
            return str;
        }
    
        int x= input.charAt(0)-'0';
        
        String[] T1= getCode(toChar(x),input.substring(1));
      
        
          String[] Temp1 = new String[T1.length];
     	  for(int i=0;i<T1.length;i++){
           String s= T1[i];
             String AnsString = val+s;
                 Temp1[i]=AnsString;
          }
        if(input.length()>1){
            
         int z =Integer.valueOf(input.substring(0, 2));
        
        String[] T2 = getCode(toChar(z),input.substring(2));
            
        String[] Temp2 = new String[T2.length];
     	  for(int i=0;i<T2.length;i++){
           String s= T2[i];
             String AnsString = val+s;
                 Temp2[i]=AnsString;
          }
            
        String MainAns[]= new String[Temp1.length+Temp2.length];
           int k=0;
            for(int i=0;i<Temp1.length;i++,k++){
                 MainAns[k]= Temp1[i];
                   }
               for(int i=0;i<Temp2.length;i++,k++){
                 MainAns[k]= Temp2[i];
            	    }

            return MainAns;
                           
             }
         return Temp1;
                
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
