

import java.util.Scanner;

public class StringtoInteger {


	public static int convertStringToInt(String input,int start,int val){
		// Write your code here

        char t=input.charAt(0);
        int value=1;
        int temp = (int)(t);
        int ans = temp-48;
        if(input.length()==1){
            return ans;
        }
        
        int Sa= convertStringToInt(input.substring(start+1),0,val-1);
        for(int i=0;i<val;i++){
            value=value*10;
        }
        Sa=ans*value+Sa;
        return Sa;
      
	}
    public static int convertStringToInt(String input){
     int ans = convertStringToInt(input,0,input.length()-1);
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(convertStringToInt(str));

	}

}
