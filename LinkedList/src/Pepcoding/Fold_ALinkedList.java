package Pepcoding;

import java.util.Scanner;

public class Fold_ALinkedList {	
	 static Node<Integer> Nleft;
	 
	public static void fold(Node<Integer> head) {
		Nleft= head;
		int size = len(head);
		foldHelper(head,0,size);
	}
	 public static int len( Node<Integer> head) {
		 
		 int count=0;
		 while(head !=null) {
			 head=head.next;
			 count++;
		 }
		 return count;
 
	 }

	private static void foldHelper(Node<Integer> head,int i,int size) {
		// TODO Auto-generated method stub
		if(head==null) {
			return;
		}
		foldHelper(head.next,i+1,size);
		if(i>size/2) {
		Node<Integer> temp = Nleft.next;
		head.next = Nleft.next;
		Nleft.next= head;
		Nleft= temp;
		}else if(i==size/2) {
			head.next=null;
		}
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
		fold(head);
		
		print(head);
	}

}
