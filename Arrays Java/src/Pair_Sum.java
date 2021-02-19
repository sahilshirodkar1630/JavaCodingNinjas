import java.util.Scanner;

//Pair Sum
//Send Feedback
//You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
//Note:
//Given array/list can contain duplicate elements. 
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the first array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//
//Third line contains an integer 'X'.
//Output format :
//For each test case, print the total number of pairs present in the array/list.
//
//Output for every test case will be printed in a separate line.
//1
//9
//1 3 6 2 5 4 3 2 4
//7
//Sample Output 1:
//7

public class Pair_Sum {

	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}
	
	public static void  merge(int[] input ,int start, int end) {

		if(input.length<=1){
			return;
		}
		int mid = (start+end)/2;
		int i= start;
		int j=mid+1;
		int  k=0;
		int[] ans = new int[end-start+1];
		
		while(i<=mid&&j<=end) {
			if(input[i]<input[j]) {
				ans[k]=input[i];
				i++;
				k++;
				
			}else {
				ans[k]=input[j];
				j++;
				k++;
				
			}
		}
		while(i<=mid) {
			ans[k]=input[i];
			i++;
			k++;
		}
		
		while(j<=end) {
			ans[k]=input[j];
			j++;
			k++;
		}
		
		
		for(int a=0;a<ans.length;a++) {
			input[start+a]= ans[a];
		}
		return;
	}
		public static void mergeSort(int[] input,int start, int end){

		// Write your 
			if(start>=end) {
				return;
			}
		int mid = (start+end)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid+1, end);
		merge(input,start,end);
	}
	public static void mergeSort(int[] input){
		// Write your code here
		mergeSort(input, 0, input.length-1);
		return;
	}
	
	public static int pairSum(int[] array, int num) {
		mergeSort(array);
		int i=0;
		int j=array.length-1;
		int count=0;
		while(i<j) {
			int val = array[i]+array[j];
			 if(val>num) {
				j--;
			}else if(val<num) {
				i++;
			}else {
				int  elemAtStart = array[i];
				int elemAtEnd = array[j];
				
				if(elemAtStart == elemAtEnd) {
					int totalElemFromStarttoEnd = (j-i)+1;
					count+=(totalElemFromStarttoEnd*(totalElemFromStarttoEnd-1)/2);
					return count;
				}
				int tempI = i+1;
				int tempJ = j-1;
				
				while(tempI<=tempJ && array[tempI]==elemAtStart) {
					tempI+=1;
				}
				
				while(tempJ>=tempI && array[tempJ]==elemAtEnd) {
					tempJ-=1;
				}
				int totalElementfromSTart = (tempI-i);
				int totalElementfromEnd = (j-tempJ);
				count += (totalElementfromSTart*totalElementfromEnd);
				
				i=tempI;
				j=tempJ;
				
			}
			
		}
		return count;
		
	
	}
	
//	Time : O(n)
	
//	public static int PairSum(int[] array) {
//		int value=0;
//		for(int i=0;i<array.length;i++) {
//			int sum =0;
//			for(int j=i+1;j<array.length;j++) {
//				System.out.print(array[i]+""+array[j]+" ");
//				sum = array[i]+array[j];
//				System.out.print(sum);
//				System.out.println();
//				if(sum ==7) {
//					value ++;
//				}
//			}
//		}
//		return value;
//	
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array[] = Takeinput();
//		System.out.println(PairSum(array));

	}

}

