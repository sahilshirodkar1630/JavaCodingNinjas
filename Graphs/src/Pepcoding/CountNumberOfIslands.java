package Pepcoding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CountNumberOfIslands {

	
	    public static void main(String[] args) throws NumberFormatException, IOException {
	        Scanner sc= new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        int[][] arr = new int[m][n];
	        for(int i=0;i<m;i++) {
	        	for(int j=0;j<n;j++) {
	        		arr[i][j] = sc.nextInt();
	        	}
	        }
	        
	        boolean visited[][] = new boolean[arr.length][arr[0].length];
	        int count=0;
	        for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j<arr[0].length;j++) {
	        		if(arr[i][j]==0&&!visited[i][j]) {
	        			getNumberOfIslands(arr,i,j,visited);
	        			count++;
	        		}
	        	}
	        }
	        System.out.println(count);
			
		}

		private static void getNumberOfIslands(int[][] arr, int i,int j, boolean[][] visited) {
			// TODO Auto-generated method stub
			int m = arr.length;
			int n = arr[0].length;
			if(i>=m||i<0|j>=n||j<0 || visited[i][j]||arr[i][j]==1) {
				return;
			}
			
			visited[i][j]= true;
			
			getNumberOfIslands(arr, i-1,j, visited);
			getNumberOfIslands(arr, i,j+1, visited);
			getNumberOfIslands(arr, i+1,j, visited);
			getNumberOfIslands(arr, i,j-1, visited);
			
		}

}
