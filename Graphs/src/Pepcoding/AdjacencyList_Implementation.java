package Pepcoding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Edge{
	int source;
	int dest;
	int weight;
	public Edge(int source,int dest,int weight) {
		// TODO Auto-generated constructor stub
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}
}

public class AdjacencyList_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfVertices = sc.nextInt();
		ArrayList<Edge>[] graph = new ArrayList[numberOfVertices];
		for(int i=0;i<numberOfVertices;i++) {
			graph[i] = new ArrayList<>();
		}
		int numberOfEdges = sc.nextInt();
		for(int i=0;i<numberOfEdges;i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			int weight = sc.nextInt();
			graph[source].add(new Edge(source,dest,weight));
			graph[dest].add(new Edge(dest,source,weight));
		}
		
		int source = sc.nextInt();
		int dest = sc.nextInt();
		boolean visited[] =  new boolean[numberOfVertices];
//		System.out.println(hasPath(graph, source, dest,visited));
		
//		ArrayList<Integer> getPath = getPath(graph,source,dest,visited);
//		if(getPath!=null) {
//			for(int i:getPath) {
//				System.out.print(i+" ");
//			}
//		}else {
//			System.out.println("-1");
//		}
	
		printAllPaths(graph,source,dest,visited,""+source);
	}
	
	private static void printAllPaths(ArrayList<Edge>[] graph, int source, int dest,boolean visited[], String output) {
		if(source == dest) {
			System.out.println(output);
			return;
		}
		visited[source] = true;
		for(Edge edge : graph[source]) {
			if(!visited[edge.dest]) {
				printAllPaths(graph, edge.dest, dest, visited, output+edge.dest);
			}
		}
		visited[source]= false;
		return;
	}

	public static ArrayList<Integer> getPath(ArrayList<Edge>[] graph, int source, int dest, boolean[] visited) {
		// TODO Auto-generated method stub
		ArrayList<Integer> output = new ArrayList<Integer>();
		if(source == dest) {
			output.add(source);
			return output;
		}
		visited[source]= true;
		for(Edge edge : graph[source]) {
			if(!visited[edge.dest]) {
				ArrayList<Integer> temp = getPath(graph, edge.dest, dest, visited);
				if(temp!=null) {
					temp.add(source);
					return temp;
				}
			}
		}
		return null;
	}

	public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean visited[]) {
		if(src == dest) {
			return true;
		}
		visited[src] = true;
		for(Edge edge : graph[src]) {
			if(!visited[edge.dest]) {
				boolean hasPath = hasPath(graph, edge.dest, dest,visited);
				if(hasPath) {
					return hasPath;
				}
			}
		}
		 return false;
	}
	
}
