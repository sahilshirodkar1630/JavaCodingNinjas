package RecursionArray;

import java.util.Scanner;

public class LastIndexOfNumber {
	
//	Last Index of Number
//	Send Feedback
//	Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
//	Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
//	You should start traversing your array from 0, not from (N - 1).
//	Do this recursively. Indexing in the array starts from 0.
//	Input Format :
//	Line 1 : An Integer N i.e. size of array
//	Line 2 : N integers which are elements of the array, separated by spaces
//	Line 3 : Integer x
//	Output Format :
//	last index or -1
//	Constraints :
//	1 <= N <= 10^3
//	Sample Input :
//	4
//	9 8 10 8
//	8
//	Sample Output :
//	3
	
	public static int lastIndex(int input[], int x,int lastIndex) {
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
 	 * Taking input and printing output is handled automatically.
	*/
    if(lastIndex<=0){
        return -1;
    }
    
    int temp = input[lastIndex];
    if(temp==x){
        return lastIndex;
    }
    int ans = lastIndex(input,x,lastIndex-1);
    return ans;
}
public static int lastIndex(int input[], int x) {
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
 	 * Taking input and printing output is handled automatically.
	*/
    int Ans= lastIndex(input,x,input.length-1);
    return Ans;
}


static Scanner s = new Scanner(System.in);

public static int[] takeInput(){
	int size = s.nextInt();
	int[] input = new int[size];
	for(int i = 0; i < size; i++){
		input[i] = s.nextInt();
	}
	return input;
	
}

public static void main(String[] args) {
	int[] input = takeInput();
	int x = s.nextInt();
	System.out.println(lastIndex(input, x));
}

	

}
