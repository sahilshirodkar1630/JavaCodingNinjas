import java.util.Scanner;

public class Edit_Distance {
/*
 * 
 * Given two strings s and t of lengths m and n respectively,
 *  find the edit distance between the strings.
	Edit Distance
	Edit Distance of two strings is minimum number of operations required to make one string equal to other.
	 In order to do so you can perform any of the following three operations only :
		1. Delete a character
		2. Replace a character with another one
		3. Insert a character
		
	Note
		Strings don't contain spaces
	Input Format :
		The first line of input contains a string, that denotes the value of s. 
		The following line contains a string, that denotes the value of t.
	Output Format :
		The first and only line of output contains the edit distance value 
		between the given strings.
		
	Constraints :
		1<= m,n <= 10
		
	Time Limit: 1 second
	
		Sample Input 1 :
			abc
			dc
			
		Sample Output 1 :
			2
 */
	
	public static int editDistance(String a, String b){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */        
		if(a.length()==0) {
			return b.length();
		}
		if(b.length()==0) {
			return a.length();
		}
		if(a.charAt(0)==b.charAt(0)) {
			//No Operations are performed
			return editDistance(a.substring(1), b.substring(1));
		}else {
			int insert = editDistance(a, b.substring(1));
			int delete = editDistance(a.substring(1), b);
			int substitute = editDistance(a.substring(1), b.substring(1));
			return 1+ Math.min(insert,Math.min(delete, substitute));
		}
		

	}
	
	public static int editDistanceM(String a, String b){
		int m = a.length();
		int n = b.length();
		int storage[][] =  new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				storage[i][j]= -1;
			}
		}
		
		return editDistanceM(a, b,storage);
		
	}
	private static int editDistanceM(String a, String b, int[][] storage) {
		// TODO Auto-generated method stub
		int m = a.length();
		int n = b.length();
		if(storage[m][n]!= -1) {
			return storage[m][n];
		}
		if(m==0) {
			storage[m][n] = n;
			return storage[m][n];
		}
		if(n==0) {
			storage[m][n] = m;
			return storage[m][n];
			
		}
		if(a.charAt(0)==b.charAt(0)) {
			//No Operations are performed
			storage[m][n]= editDistanceM(a.substring(1), b.substring(1),storage);
		}else {
			int insert = editDistanceM(a, b.substring(1),storage);
			int delete = editDistanceM(a.substring(1), b,storage);
			int substitute = editDistanceM(a.substring(1), b.substring(1),storage);
			storage[m][n] = 1+ Math.min(insert,Math.min(delete, substitute));
		}
		return storage[m][n];
	}
	public static int editDistanceDP(String a,String b) {
		int m = a.length();
		int n = b.length(); 
		int storage[][] =  new int[m+1][n+1];
		for(int j=0;j<n+1;j++) {
			storage[0][j]= j;
		}
		for(int i=0;i<m+1;i++) {
			storage[i][0]= i;
		}
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(a.charAt(m-i) ==  b.charAt(n-j)) {
					storage[i][j]= storage[i-1][j-1];
				}else {
					storage[i][j] = 1+ Math.min(storage[i][j-1], Math.min(storage[i-1][j],storage[i-1][j-1]));
				}
			}
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a =  sc.nextLine();
		String b =  sc.nextLine();
		System.out.println(editDistanceDP(a, b));
		System.out.println(editDistanceM(a, b));
		System.out.println(editDistance(a, b));
	}

}
