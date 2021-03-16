package Pepcoding;

import java.util.Scanner;

public class Reverse_LinkedList_Pointer_Iterative {

	public static Node<Integer> ReversePointer(Node<Integer> head){
		if(head==null) {
			return head;
		}
		
		Node<Integer> prev = null;
		Node<Integer> current = head;
		
		while(current!=null){
			Node<Integer> next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	public static Node<Integer> takeInput(){ // O(n)
		Node<Integer> head = null,tail = null; 
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = tail.next; // OR tail= newNode;
				
			}
			data =sc.nextInt();
			
		}
		return head;
	}
	
	
	public static void print(Node<Integer> head) {
		
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
			}
			System.out.println();
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = ReversePointer(head);
		print(head);
	}

}
