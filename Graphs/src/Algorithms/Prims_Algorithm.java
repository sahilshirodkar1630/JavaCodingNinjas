package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Prims_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int adjacencyMatrix[][] = new int[v][v];
		for(int i=0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			adjacencyMatrix[v1][v2]= weight;
			adjacencyMatrix[v2][v1] = weight;
		}
		
		Prims(adjacencyMatrix,v);
	}

	private static void Prims(int[][] adjacencyMatrix, int v) {
		// TODO Auto-generated method stub
		boolean visited[] = new boolean[v];
		int weights[] = new int[v];
		int parents[] = new int[v];

		for(int i=0;i<v;i++) {
			if(i!=0) {
				weights[i] = Integer.MAX_VALUE;
			}else {
				weights[i] = 0;
				parents[i] = -1;
			}
		}
		
		for(int i=0;i<v;i++) {
			int minVertex = findVertex(weights,visited);
			visited[minVertex]= true;
			//Exploring its uncvisited neighbors
			for(int j=0;j<v;j++) {
				if(adjacencyMatrix[minVertex][j]!=0 && !visited[j]) {
					if(adjacencyMatrix[minVertex][j]< weights[j]) {
						weights[j]= adjacencyMatrix[minVertex][j];
						parents[j]= minVertex;
					}
				}
			}
			
		}
		
		for(int i=1;i<v;i++) {
			if(i<parents[i]) {
			System.out.println(i+" "+parents[i]+" "+weights[i]);
			}else {
				System.out.println(parents[i]+" "+i+" "+weights[i]);
			}
		}
	}

	private static int findVertex(int[] weights, boolean[] visited) {
		// TODO Auto-generated method stub
		for(int i: weights) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int minVertex = -1;
		for(int i=0;i<weights.length;i++) {
			if(!visited[i]&&(minVertex == -1||weights[i]<weights[minVertex])) {
				minVertex= i;;
			}
		}
		return minVertex;
	}

}
