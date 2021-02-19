package while_loop;

import java.util.Scanner;

public class fah_cel_table {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
		
//        if(0 <= s <= 80 && s <= e <=  900 && 0 <= w <= 40  ){
            while(s<=e){
                int cel = (5*(s-32))/9;
                System.out.println(s+" "+cel);

                s=s+w;
//            }
        }
        
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
    
        

		
	}

}
