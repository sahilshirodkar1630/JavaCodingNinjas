import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Remove_Duplicates {
	
	public static ArrayList<Integer> removeDuplicates(int array[]){
		ArrayList<Integer> output = new ArrayList<Integer>();
		HashMap<Integer, Boolean>  seen  = new HashMap<Integer, Boolean>();
		for(int i=0;i<array.length;i++) {
			if(seen.containsKey(array[i])) {
				continue;
				
			}
			output.add(array[i]);
			seen.put(array[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc .nextInt();
		int array[] = new int[n]; 
		for(int i=0;i<n;i++) {
			array[i]= sc.nextInt();
		}
		
		ArrayList<Integer> output = removeDuplicates(array);
		for(int i:output) {
			System.out.print(i+" ");
		}
		
	}

}
