package Algorithms;

import java.util.Scanner;

public class Dijkstras_Algorithm {

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
		
		
		Dijkstras(adjacencyMatrix);

	}

	private static void Dijkstras(int[][] adjacencyMatrix) {
		// TODO Auto-generated method stub
		int n = adjacencyMatrix.length;;
		boolean visited[] = new boolean[n];
		int distance[] = new int[n];
		distance[0] = 0;
		for(int i=1;i<n;i++) {
			 distance[i] = Integer.MAX_VALUE;
		}
		for(int i=0;i<n;i++) {
			int minVertex = findMinimum(distance,visited);
			visited[minVertex] = true;
			for(int j=0;j<n;j++) {
				if(adjacencyMatrix[minVertex][j]!=0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
					int dis = distance[minVertex] + adjacencyMatrix[minVertex][j];
					if(dis<distance[j]) {
						distance[j] = dis;
					}
				}
			}
		}
		for(int i=0;i<distance.length;i++) {
			System.out.println(i+" "+distance[i]);
		}
	}

	private static int findMinimum(int[] distance, boolean[] visited) {
		// TODO Auto-generated method stub
		int minVertex=-1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i]&& ( minVertex==-1 ||distance[i]<distance[minVertex])) {
				minVertex  = i;
			}
		}
		return minVertex;
	}

}
