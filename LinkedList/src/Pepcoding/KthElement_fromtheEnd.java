package Pepcoding;

import java.util.Scanner;

public class KthElement_fromtheEnd {
	
	public static int KthElementfromLast(Node<Integer> head,int k) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		for(int i=0;i<k;i++) {
			fast=fast.next;
		}
		while(fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.println(KthElementfromLast(head, 2));
		
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
	
}
