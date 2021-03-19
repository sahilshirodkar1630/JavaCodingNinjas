package Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numberOfVertices = sc.nextInt();
		int numberOfEdges = sc.nextInt();
		int adjacencyMatrix[][]= new int[numberOfVertices][numberOfVertices];
		for(int i=0;i<numberOfEdges;i++) {
			int fv = sc.nextInt();
			int sv =sc.nextInt();
			adjacencyMatrix[fv][sv]=1;
			adjacencyMatrix[sv][fv]=1;    
		} 
		boolean[] visited = new boolean[adjacencyMatrix.length];
		ArrayList<ArrayList<Integer>> allComponents =  new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<adjacencyMatrix.length;i++) {
			if(!visited[i]) {
			 ArrayList<Integer> Component =getAllComponents(adjacencyMatrix,i,visited);
			 allComponents.add(Component);
			}
		}
		int pairs = 0;
		for(int i=0;i<allComponents.size();i++) {
			for(int j=i+1;j<allComponents.size();j++) {
				int count = allComponents.get(i).size()* allComponents.get(j).size();
				pairs +=count;
			}
		}
		System.out.println(pairs);
		
//		for(ArrayList<Integer> array: allComponents) {
//			for(int i:array) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//			
//		}
	}

	private static ArrayList<Integer> getAllComponents(int[][] adjacencyMatrix, int source, boolean[] visited) {
		// TODO Auto-generated method stub
		ArrayList<Integer> output = new ArrayList<Integer>();
		visited[source] = true;
		output.add(source);
		for(int i=0;i<adjacencyMatrix.length;i++) {
			if(adjacencyMatrix[source][i]==1 && !visited[i]) {
				ArrayList< Integer> temp = getAllComponents(adjacencyMatrix, i, visited);
				for(int j:temp) {
					output.add(j);
				}
			}
		}
		return output;
	}

}
