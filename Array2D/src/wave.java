import java.util.Scanner;

public class wave {

	public static int[][] Takeinput(){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c= sc.nextInt();
		int a[][] = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]= sc.nextInt();
			}
		}
		
		return a;
	}
	
//	4 4 
//	1 2 3 4 
//	5 6 7 8 
//	9 10 11 12 
//	13 14 15 16
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = Takeinput();
		 int r= a.length;
	        int c = a[0].length;
	        int TotalIndex =r*c;
		  int colStart = 0;
	        int colEnd = c-1;
	        int rowStart= 0;
	        int rowEnd = r-1;
		int value=0;
		while(value<+TotalIndex) {
		
		for(int i=colStart;i<=colEnd;i++) {
    		System.out.print(a[rowStart][i]+" ");
    		value++;
    	}
		rowStart++;
		for(int i=rowStart;i<=rowEnd;i++) {
	    		System.out.print(a[i][colEnd]+" ");
	    		value++;
	    	}
		colEnd--;
		
		for(int i=colEnd;i>=colStart;i--) {
    		System.out.print(a[rowEnd][i]+" ");
    		value++;
    	}
		rowEnd--;
		for(int i=rowEnd;i>=rowStart;i--) {
    		System.out.print(a[i][colStart]+" ");
    		value++;
		}
		colStart++;

		}
	}

}
