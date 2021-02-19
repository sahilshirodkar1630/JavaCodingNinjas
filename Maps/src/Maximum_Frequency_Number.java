import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Maximum_Frequency_Number {

//	Extract Unique characters
//	Send Feedback
//	Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.
//	Input format:
//	The first and only line of input contains a string, that denotes the value of S.
//	Output format :
//	The first and only line of output contains the updated string, as described in the task.
//	Constraints :
//	0 <= Length of S <= 10^8
//	Time Limit: 1 sec
//	Sample Input 1 :
//	ababacd
//	Sample Output 1 :
//	abcd
//	Sample Input 2 :
//	abcde
//	Sample Output 2 :
//	abcde
	  public static int maxFrequencyNumber(int[] array){ 
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
		  HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		  
		  for(int i=0;i<array.length;i++) {
			  if(maps.containsKey(array[i])) {
				  maps.put(array[i],maps.get(array[i])+1);
				  continue;
			  }
			  
			  maps.put(array[i], 1);
		  }
		  Set<Integer> keys =maps.keySet();
		  for(int i: keys) {
			  System.out.println(i+" "+maps.get(i));
		  }
		  int max=0;
		  int ans =0;
		  for(int i:keys) {
			  int val=maps.get(i);
			  if(val>max) {
				  max= val;
				  ans = i;
			  }
		  }
		  return ans;
		  
	  }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n= sc .nextInt();
		int array[] = new int[n]; 
		for(int i=0;i<n;i++) {
			array[i]= sc.nextInt();
		}
		System.out.println(maxFrequencyNumber(array));
	}

}
