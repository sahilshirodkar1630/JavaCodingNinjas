import java.util.Scanner;

public class ReturnPermutation_String {

	
	public static String[] permutationOfString(String input){
		if(input.length()==2){
		String a=input.substring(0,1)+input.substring(1);
		String b=input.substring(1)+input.substring(0,1);
		String[] arr=new String[]{a,b};
		return arr;
		}
        
        int f=1;
        for(int i=1; i<=input.length(); i++)
            f*=i;
        
        int index=0;
        String[] ans=new String[f];
        for(int i=0; i<input.length(); i++){
            String[] arr=permutationOfString(input.substring(0,i)+input.substring(i+1));
            for(int j=0; j<arr.length; j++){
            	ans[index++]=input.charAt(i)+arr[j];
            }
    	}
        
        return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
