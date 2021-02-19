import java.util.Scanner;

public class twoSubstrings {
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}
	public static void twoSubstrings(String str)
	{
		// Write your code here
        int a[]= new int[256];
        boolean Ans =false;
        boolean Yess = false;
        boolean AB = false;
        for(int i=0;i<str.length();i++){
            int value = a[(int)(str.charAt(i))];
            a[(int)(str.charAt(i))] = value = value+1;
        }
        if(a[(int)('A')]==2&&a[(int)('B')]==2){
            Yess = true;
        }
        PrintArray(a);
        for(int i=0;i<str.length()+1;i++){
        	if(i==str.length()-1) {
        		break;
        	}
        	
            if(str.charAt(i)=='A'){
            	
                if(str.charAt(i+1)=='B'){
                    AB = true;
                    break;
                }
            }
        }
         for(int i=0;i<str.length()+1;i++){
        	 if(i==str.length()-1) {
         		break;
         	}
            if(str.charAt(i)=='B'&& str.charAt(i+1)=='A'){
                    if(Yess&&AB){
                        Ans = true;
                        break;
                    }
            }
        }
        if(Ans){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		twoSubstrings(str);
	}

}
