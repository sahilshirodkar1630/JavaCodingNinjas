import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MinPQComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2){
			return -1;
		}else  if(o1>o2) {
			return 1;
		}
		return 0;
	}
}

class MaxPQComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2){
			return 1;
		}else  if(o1>o2) {
			return -1;
		}
		return 0;
		
	}
}
class StringLengthCoomparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length()<o2.length()){
			return -1;
		}else  if(o1.length()>o2.length()) {
			return 1;
		}
		return 0;
	}
}
public class PriorityQueueUse {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Our Implementation
//		PriorityQueueMax pq = new PriorityQueueMax();
//		int arr[] = {10,5,15,2,4,20};
//		for(int i=0;i<arr.length;i++) {
//			pq.insert(arr[i]);
//		}
//		while(!pq.isEmpty()) {
//			System.out.print(pq.removeMax()+" ");
//		}
//		System.out.println();
		
//		Inbulid Priority Queue 
//		insert -> add
//		getMin -> peek/element;
		
		
		
		//Inbuild Priority Queue Min
		//We Use normal PriorityQueue for MinPQ
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		int arr[] = { 9,1,0,4,7,3};
//		for(int i=0;i <arr.length;i++) {
//			pq.add(arr[i]);
//		}
////		System.out.println(pq.element());
//		
//		while(!pq.isEmpty()) {
//			System.out.print(pq.remove()+" ");
//			
//		}
		
		//Inbuild Priority Queue Max
//		MaxPQComparator maxComparator = new MaxPQComparator();
//		MaxCoomparatoor already exists
		String arr[]= {"this", "at","a","their","queues"};
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//		int arr[] = { 9,1,0,4,7,3};
		StringLengthCoomparator stringComparator = new StringLengthCoomparator();
		
		PriorityQueue<String> pq = new PriorityQueue<String>(stringComparator);
		for(int i=0;i <arr.length;i++) {
			pq.add(arr[i]);
		}
//		System.out.println(pq.element());
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
			
		}
	}
}
