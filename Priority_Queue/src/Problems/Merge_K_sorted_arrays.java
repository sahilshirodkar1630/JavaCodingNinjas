package Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.PriorityQueue;

//Given k different arrays, which are sorted individually (in ascending order).
//You need to merge all the given arrays such that output array should be sorted (in ascending order).

//Sample Input 1:
//4
//3
//1 5 9
//2
//45 90
//5
//2 6 78 100 234
//1
//0
//Sample Output 1:
//0 1 2 5 6 9 45 78 90 100 234

  class PQComparator implements Comparator<Triplet>{
	public int compare(Triplet o1, Triplet o2) {
		if(o1.element<o2.element){
			return -1;
		}else  if(o1.element>o2.element) {
			return 1;
		}
		return 0;
	}
}
 class Triplet {
		int element;
		int arrayIndex;
		int elemIndex;
	}


public class Merge_K_sorted_arrays {

	public static void print(ArrayList<ArrayList<Integer>> input) {
		for(int i=0;i<input.size();i++){
			for(int j=0;j<input.get(i).size();j++) {
				System.out.print(input.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		ArrayList<Integer> output = new ArrayList<Integer>();
		int k= input.size();
		PQComparator comparator = new PQComparator();
		PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>(comparator);
		for(int i=0;i<k;i++) {
			for(int j=0;j<1;j++) {
				Triplet temp = new Triplet();
				temp.element = input.get(i).get(j);
				temp.arrayIndex=i;
				temp.elemIndex=j;
				pq.add(temp);
			}
		}
		while(!pq.isEmpty()) {
			Triplet temp =pq.remove();
			Triplet ans = new Triplet();
			output.add(temp.element);
			if(temp.elemIndex+1<input.get(temp.arrayIndex).size()) {
			ans.element= input.get(temp.arrayIndex).get(temp.elemIndex+1);
			ans.arrayIndex= temp.arrayIndex;
			ans.elemIndex= temp.elemIndex+1;
			pq.add(ans);
			}
		}
		

		return output;
	}
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }
    
    public static void main(String[] args) throws IOException {
		int k = Integer.parseInt(br.readLine().trim());
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		while(k > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			ArrayList<Integer> current = new ArrayList<Integer>();
            String[] strNums;
            strNums = br.readLine().split("\\s");
            for(int i = 0; i < n; i++) {
				current.add(Integer.parseInt(strNums[i]));
			}
			input.add(current);
			k--;
		}
        ArrayList<Integer> output = mergeKSortedArrays(input);
        if (output!=null){
            for(int i : output) {
                System.out.print(i + " ");
            }
        }

	}

}
