package Pepcoding;

import java.util.LinkedList;

public class LLToQueueAdapter {

	LinkedList<Integer> list;
	public LLToQueueAdapter() {
		// TODO Auto-generated constructor stub
		list = new LinkedList<Integer>();
	}
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}else {
			return false;
		}
	}
	public int size() {
		return list.size();
	}
	public void enqueue(int val) {
		list.addFirst(val);
	}
	public int dequeue() {
		if(size()==0) {
			System.out.println(" Stack Underflow");
			return -1;
		}else {
		return list.removeLast();
		}
	}
	public int top() {
		if(size()==0) {
			System.out.println(" Stack Underflow");
			return -1;
		}
		return list.getLast();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LLToQueueAdapter queue = new LLToQueueAdapter();
		for(int i=0;i<5;i++) {
			queue.enqueue(i);
		}
		while(!queue.isEmpty()) {
			System.out.print(queue.dequeue()+" ");
		}
	}

}
