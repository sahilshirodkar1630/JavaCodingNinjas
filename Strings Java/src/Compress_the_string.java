import java.util.Scanner;

public class Compress_the_string {
	public static String Compress(String str) {

        String ans = new String();
//        ans = str.substring(0,1);
//        int a[]= new int[256];
//        for(int i=0;i<str.length();i++) {
//			int value = a[(int)(str.charAt(i))];
//			a[(int)(str.charAt(i))]= value=value+1;
//			
//		}
        
        boolean same = false;
        
        int value =1;
        for(int i=1;i<str.length();i++){
        	
            if(str.charAt(i)==str.charAt(i-1)){
            	value++;
            	same = true;
            	System.out.println(ans);
            	if(i==str.length()-1) {
            		ans = ans +str.substring(i-1, i);
            		ans= ans+value;
            	}
            	continue;
            }
            if(same && str.charAt(i)!=str.charAt(i-1)) {
               ans=ans +str.substring(i-1, i);
               ans= ans+value;
               same= false;
               value=1;
              }
           
            else if( str.charAt(i)!=str.charAt(i-1)) {    
            	ans = ans +str.substring(i-1, i);
            }
            
//             if(str.charAt(i)!=str.charAt(i-1)){
//            	same = false;
//                ans = ans+str.substring(i,i+1);
//            }
//             
        }
              return ans;
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Compress(str));
	}

}
