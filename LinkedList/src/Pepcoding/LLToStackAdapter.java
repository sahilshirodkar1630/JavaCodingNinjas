package Pepcoding;

import java.util.LinkedList;

public class LLToStackAdapter {
	LinkedList<Integer> list;

	public LLToStackAdapter() {
		// TODO Auto-generated constructor stub
		list= new LinkedList<Integer>();
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
	public void push(int val) {
		list.addFirst(val);
	}
	public int pop() {
		if(size()==0) {
			System.out.println(" Stack Underflow");
			return -1;
		}else {
		return list.removeFirst();
		}
	}
	public int top() {
		if(size()==0) {
			System.out.println(" Stack Underflow");
			return -1;
		}
		return list.get(0);
	
	}
	
	public static void main (String args[]) {
		LLToStackAdapter stack = new LLToStackAdapter();
		for(int i=0;i<5;i++) {
		stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
}
