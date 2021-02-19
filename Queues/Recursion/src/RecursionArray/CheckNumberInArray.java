package RecursionArray;

import java.util.Scanner;

public class CheckNumberInArray {

	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(input.length==0){
            return false;
        }
        int temp = input[0];
        if(temp==x){
        return true;
        }
        
           int arr[] = new int[input.length-1];
		for(int i=1;i<input.length;i++){
			arr[i-1]=input[i];
		}
        
        boolean ans = checkNumber(arr,x);
        return ans;
        
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}

}
