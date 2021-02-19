package RecursionString;

import java.util.Scanner;

public class CheckAB {

//	My Solution
//	public static boolean checkABHelper(String input) {
//		// Write your code here
//
//        if(input.length()==0){
//         return true;
//        }
//        if(input.charAt(0)=='b'){
//            if(input.charAt(1)=='b'){
//                boolean ans = checkABHelper(input.substring(2));
//            return ans;
//            }else{
//                return false;
//            }
//        }
//        boolean ans = checkABHelper(input.substring(1));
//        return ans;
//	}
//	
//    public static boolean checkAB(String input) {
//        
//        if(input.charAt(0)=='a'){
//            boolean ans = checkABHelper(input.substring(1));
//            return ans;
//        }else{
//            return false;
//        }
//    }
	
//	Solution
	public static boolean checkAB(String input) {
		if(input.length()==0){
	         return true;
	        }
		if(input.charAt(0)=='a') {
			
			if(input.substring(1).length()>1 && input.substring(1,3).equals("bb")) {
			 return checkAB(input.substring(3));
			}else {
				return checkAB(input.substring(1));
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}

}
