package Pattern2;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	//	5
//	    1
//	   12
//	  123
//	 1234
//	12345


		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;

        }
        
	}
}
