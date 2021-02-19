import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Longest_Consecutive_Sequence {

//	Longest Consecutive Sequence
//	You are given an array of unique integers that contain numbers in random order.
//	You have to find the longest possible sequence of consecutive numbers using the numbers from given array.
//	You need to return the output array which contains starting and ending element
//	If the length of the longest possible sequence is one, then the output array must contain only single element.
//	
//	
//	Note:
//	1. Best solution takes O(n) time.
//	2. If two sequences are of equal length, then return the
//		sequence starting with the number whose occurrence is earlier in the array.
//		
//	Input format:
//		
//	The first line of input contains an integer, that denotes 
//	the value of the size of the array. 
//	Let us denote it with the symbol n.
//	The following line contains n space separated integers,
//	that denote the value of the elements of the array.
//	
//	Output format:
//		
//	The first and only line of output contains starting and ending element of the longest consecutive sequence. 
//	If the length of longest consecutive sequence, then just print the starting element.
//	
//	Constraints :   0 <= n <= 10^6
//	
//	Time Limit: 1 sec
//	
//	Sample Input 1 :
//	13
//	2 12 9 16 10 5 3 20 25 11 1 8 6 
//	Sample Output 1 :
//	8 12 
//	Sample Input 2 :
//	7
//	3 7 2 1 9 8 41
//	Sample Output 2 :
//	7 9
//	
//	Explanation: Sequence should be of consecutive numbers.
//	Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], 
//	but we should select [7, 8, 9] because the starting point of [7, 8, 9] comes first in input array and therefore,
//	the output will be 7 9, as we have to print starting and ending element of the longest consecutive sequence.
//	Sample Input 3 :
//	7
//	15 24 23 12 19 11 16
//	Sample Output 3 :
//	15 16
	
	
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
	    ArrayList<Integer> output = new ArrayList<Integer>();
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        HashMap<Integer,Boolean> maps = new HashMap<Integer,Boolean>();
	        int maxLength=0;
	        int startTemp=-1,startFinal=-1;
	        for(int i=0;i<arr.length;i++){
	            maps.put(arr[i],true);
	        }
	        for(int i=0;i<arr.length;i++){
	            int val = arr[i]+1;
	            temp.add(arr[i]);
	            
	            // Move forward
	            while(maps.containsKey(val)){
	                    temp.add(val);
	                    maps.put(val,false);
	                    val=val+1;
	                
	            }
	            // Move Backward
	            val = arr[i]-1;
	            while(maps.containsKey(val)){
	                    temp.add(val);
	                    maps.put(val,false);
	                    val=val-1;
	                
	            }
	            //finding start element index
	            for(int j=0;j<arr.length;j++) {
	            	if(arr[j]==val+1) {
	            		startTemp=j;
	            		break;
	            	}
	            }
	            
	            if(temp.size()>maxLength){
	            	maxLength=temp.size();
	                output=temp;
	                startFinal=startTemp;
	            }else if(temp.size()==maxLength){
	            	if(startTemp<startFinal){
	            		maxLength=temp.size();
	                    output = temp;
	                    startFinal=startTemp;
	                }
	            }
	            temp=new ArrayList<Integer>();
	        }
	        Collections.sort(output);
	        ArrayList<Integer> ans =  new ArrayList<Integer>();
	        ans.add(output.get(0));
	        if(output.size()>1){
	        ans.add(output.get(output.size()-1));
	        }
	        return ans;
	         
	      
	      
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

    public static void printArray(ArrayList<Integer> arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int[] arr = takeInput();
        ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
        printArray(ans);

    }
	
	
	
	
	
}
