import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListPermutation {

	
	private static ArrayList<String> ans = new ArrayList<>();
    public static ArrayList<String> FindPermutations(String str) {

        char[] arr = str.toCharArray();
        FindPermutationsHelper(arr,0,arr.length-1);
        return ans;
        // Write your code here!

    }
    private  static void FindPermutationsHelper(char[]a,int i,int j){
        if(i>=j)
        {
         	String permutation ="";
            for(int k=0;k<a.length;k++){
                permutation+=(a[k]);
            }
            ans.add(permutation);
            return;
        }   
        for(int k=i;k<=j;k++){
            swap(a,i,k);
            FindPermutationsHelper(a,i+1,j);
            swap(a,i,k);

        }
    }
    private  static void swap(char[] a,int i,int j){
        char te = a[i];
        a[i]=a[j];
        a[j]= te;
    }
	
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        ArrayList<String> ans = FindPermutations(str);
        for (String aa : ans) {
            System.out.println(aa);
        }
    }

}
