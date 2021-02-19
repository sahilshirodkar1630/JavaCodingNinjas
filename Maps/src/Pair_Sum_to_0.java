import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Pair_Sum_to_0 {
	
//	Pair Sum to 0
//	Send Feedback
//	Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
//	Note: Array A can contain duplicate elements as well.
//	Input format:
//	The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
//	The following line contains N space separated integers, that denote the value of the elements of the array.
//	Output format :
//	The first and only line of output contains the count of pair of elements in the array which sum up to 0. 
//	Constraints :
//	0 <= N <= 10^4
//	Time Limit: 1 sec
//	Sample Input 1:
//	5
//	2 1 -2 2 3
//	Sample Output 1:
//	2
	
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        	HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for(int i=0;i<input.length;i++) {
			if(maps.containsKey(input[i])) {
				maps.put(input[i], maps.get(input[i])+1);
			}else {
			maps.put(input[i], 1);
			}
		}
		int count=0;
		for(int i=0;i<input.length;i++) {
			int val = 0-input[i];
			if(maps.containsKey(val)) {
				int a = maps.get(input[i]);
				int b = maps.get(val);
                if(input[i]==0){
                int temp = (a*(a-1))/2;
                count+=temp;
                }else{
				int temp = a*b;
				count+=temp;
                }
				maps.put(input[i],0);
				maps.put(val, 0);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc .nextInt();
		int array[] = new int[n]; 
		for(int i=0;i<n;i++) {
			array[i]= sc.nextInt();
		}
//		PairSum(array, 6);
		System.out.println(PairSum(array, array.length));
	}

}
