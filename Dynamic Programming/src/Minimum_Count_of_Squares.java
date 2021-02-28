import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimum_Count_of_Squares {

	
	public static int minCount(int n) {
		//Your code goes here
		int[] storage = new int[n+1];
		storage[0]= 0;
		storage[1]= 1;
		for(int i=2;i<=n;i++){
			int minCount = Integer.MAX_VALUE;
			int j=1;
			while(j*j<=i) {
				int val = i-j*j;
				if(storage[val]<minCount) {
					minCount= storage[val];
				}
				j++;
			}
		storage[i]= minCount+1;	
		}
		return storage[n];
	}
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(minCount(n));
}

}
