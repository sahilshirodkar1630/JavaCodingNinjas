import java.util.Scanner;

public class Print_All_Substring {
	public static void printSubstrings(String str) {
		//Your code goes here
        int i=0;
        while(i<=str.length()){
            int j=i+1;
            while(j<=str.length()){
                System.out.println(str.substring(i, j));

                j++;
            }
            i++;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSubstrings(str);
		
		
		
		
		
		

	}

}
