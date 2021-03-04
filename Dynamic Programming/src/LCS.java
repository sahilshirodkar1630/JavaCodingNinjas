import java.util.Scanner;

public class LCS {

	public static int findLCS(String a,String b) {
		if(a.length()==0 || b.length()==0) {
			return 0;
		}
		if(a.charAt(0)==b.charAt(0)) {
			return 1+findLCS(a.substring(1), b.substring(1));
		}else {
//			int op1 = findLCS(a.substring(1), b.substring(1));
			int op1 = findLCS(a, b.substring(1));
			int op2 = findLCS(a.substring(1), b);
			return Math.max(op1, op2);
		}
	}
	
	public static int findLCSM(String a,String b) {
		int m = a.length();
		int n = b.length();
		int storage[][] = new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				storage[i][j]= -1;
			}
		}
		
		return findLCSM(a, b,storage);
	}
	// Memoization Approach
	private static int findLCSM(String a, String b, int[][] storage) {
		// TODO Auto-generated method stub
		int m = a.length();
		int n = b.length();
		
		if(storage[m][n]!= -1) {
			return storage[m][n];
		}
		
		if(m == 0 || n == 0) {
			storage[m][n]=0;
			return storage[m][n];
		}
		
		if(a.charAt(0)==b.charAt(0)) {
			storage[m][n] = 1+findLCSM(a.substring(1), b.substring(1), storage);
		}else {
			int op1 = findLCSM(a, b.substring(1), storage);
			int op2 = findLCSM(a.substring(1), b, storage);
			storage[m][n] = Math.max(op1, op2);
		}
		
		return storage[m][n];
		
	}
	//Dynamic Programming Approach
	public static int findLCSDP(String a,String b) {
		int m = a.length();
		int n = b.length();
		int storage[][] = new int[m+1][n+1];
		for(int i=m;i>=0;i--) {
			storage[i][0]=0;
		}
		for(int j=n;j>=0;j--) {
			storage[0][j]=0;
		}
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(a.charAt(m-i)==b.charAt(n-j)) {
					storage[i][j]= 1+storage[i-1][j-1];
				}else {
					storage[i][j] = Math.max(storage[i-1][j], storage[i][j-1]);
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
		System.out.println(findLCSDP(a, b));
		System.out.println(findLCSM(a, b));
		System.out.println(findLCS(a, b));
	}

}
