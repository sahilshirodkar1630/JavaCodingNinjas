import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Longest_Subset_Zero_Sum {

	
//	Longest subset zero sum
//	Send Feedback
//	Given an array consisting of positive and negative integers, find the length of the longest subarray whose sum is zero.
//	Input Format:
//	The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
//	The following line contains N space separated integers, that denote the value of the elements of the array.
//	Output Format
//	The first and only line of output contains length of the longest subarray whose sum is zero.
//	Constraints:
//	0 <= N <= 10^8
//	Time Limit: 1 sec
//	Sample Input 1:
//	10 
//	 95 -97 -387 -435 -5 -70 897 127 23 284
//	Sample Output 1:
//	5
//	Explanation:
//	The five elements that form the longest subarray that sum up to zero are: -387, -435, -5, -70, 897 
//	
	
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
      HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		int sum =0,maxLength =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
            if(sum==0){
                if(i>maxLength){
                    maxLength=i+1;
                }
                maps.put(sum,i);
            }else if(maps.containsKey(sum)) {
				int val = i-maps.get(sum);
				// System.out.println(arr[i]+" "+sum+" "+ val);
				
				if(val>maxLength) {
					maxLength= val;
				}
				
			}else {
				maps.put(sum,i);
			}
			 
		}
		return maxLength;
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
	}

}
