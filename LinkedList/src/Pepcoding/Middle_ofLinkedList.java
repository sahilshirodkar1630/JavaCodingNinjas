package Pepcoding;

import java.util.Scanner;

public class Middle_ofLinkedList {
	
	public static  Node<Integer> middle(Node<Integer> head) {
		if(head==null|| head.next==null) {
			return head;
		}
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next!=null&&fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
			
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
		Node<Integer>mid = middle(head);
		System.out.println(mid.data);
	}

}
