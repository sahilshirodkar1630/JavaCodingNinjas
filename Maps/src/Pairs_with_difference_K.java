import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Pairs_with_difference_K {

//	
//	You are given with an array of integers and an integer K. 
//	You have to find and print the count of all such pairs which have difference K.
//	
//	Note: Take absolute difference between the elements of the array.
	
//	Input Format:
//	The first line of input contains an integer, that denotes the value of the size of the array.
//	Let us denote it with the symbol n.
//	The following line contains n space separated integers, that denote the value of the elements of the array.
//	The following line contains an integer, that denotes the value of K.
	
	
//	Output format :
//	The first and only line of output contains count of all such pairs which have an absolute difference of K. 
//	Constraints :
//	0 <= n <= 10^4
//	Time Limit: 1 sec
	
//	Sample Input 1 :
//	4 
//	5 1 2 4
//	3
//	Sample Output 1 :
//	2
//	Sample Input 2 :
//	4
//	4 4 4 4 
//	0
//	Sample Output 2 :
//	6
	
	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
        ArrayList<Integer> output = new ArrayList<Integer>();
        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(maps.containsKey(arr[i])){
                maps.put(arr[i],maps.get(arr[i])+1);
            }else {
            maps.put(arr[i],1);
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	int val = arr[i]-k;
        	// System.out.println(val+"val");
        	if(maps.containsKey(val)) {
        		int a = maps.get(val);
        		if(a>0) {
        			if(k!=0) {
        				count+= maps.get(arr[i])*a;
        				maps.put(val, 0);
        			}else {
        		// System.out.println((a-1)*2);
        				count+= (a-1)*2;
        				maps.put(val, 0);
                		maps.put(arr[i],0);
 
        			}
        		}
        	}
        	
        			
        }
        
        return count;
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
		int k = Integer.parseInt(br.readLine());
		System.out.println(getPairsWithDifferenceK(arr, k));
	}

}
