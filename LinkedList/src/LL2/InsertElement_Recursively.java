package LL2;
import java.util.Scanner;

public class InsertElement_Recursively {

	public static void print(Node<Integer> head) {


		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
			}
			System.out.println();
	}
	
	public static Node<Integer> insertRec(Node<Integer> head,int pos,int elem){
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(elem);
			newNode.next = head;
			return newNode;
		}
		if(head.next== null) {
			return head;
		}
		
		head.next = insertRec(head.next, pos-1, elem);
		return head;
		
	}
	public static Node<Integer> takeInput() // O(n)
	{
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Node<Integer> head = takeInput();
//		head = Reverse(head);
		
		
		Node<Integer> temp = insertRec(head, 2, 10);
		
		print(temp);
	}

}
