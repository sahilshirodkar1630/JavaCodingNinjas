import java.util.Scanner;

public class SumOfArray {

	
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
        if(input.length==0){
            return 0;
        }
        int temp = input[0];
        
        int arr[] = new int[input.length-1];
		for(int i=1;i<input.length;i++){
			arr[i-1]=input[i];
		}
       
        int ans= sum(arr)+temp;
        return ans;
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}

}
