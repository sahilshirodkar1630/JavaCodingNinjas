package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class Kth_largest_element {
	
//	Given an array A of random integers and an integer k, 
//	find and return the kth largest element in the array.
	
//	Sample Input 1 :
//		6
//		9 4 8 7 11 3
//		2
//		Sample Output 1 :
//		9
//		Sample Input 2 :
//		8
//		2 6 10 11 13 4 1 20
//		4
//		Sample Output 2 :
//		10

	
	
	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int i=0;
		for(;i<k;i++) {
			pq.add(input[i]);
		}
		while(i<input.length) {
			int temp= pq.peek();
			if(input[i]>temp) {
				pq.remove();
				pq.add(input[i]);
			}
			i++;
		}
		return pq.remove();
	}
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		System.out.println(kthLargest(n, input, k));
	}
}
