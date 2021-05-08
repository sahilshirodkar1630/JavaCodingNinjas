package LL1;
import java.util.Scanner;


public class Lengthof_LinkedList {
	
	public static int getLength(Node<Integer> head) {
		Node<Integer> temp = head;
		int count=0;
		while(temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void printLinkedList(Node<Integer> head ) {
		Node<Integer> temp = head;
		while(temp!= null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null,tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			Node<Integer> node = new Node<Integer>(data);
			if(head==null) {
				head=node;
				tail=node;
			}else {
				tail.next=node;
				tail=tail.next;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
//	public static Node<Integer> takeInput(){ // O(n)
//		
//		Node<Integer> head = null,tail = null; 
//		Scanner sc = new Scanner(System.in);
//		int data = sc.nextInt();
//		
//		while(data != -1) {
//			Node<Integer> newNode = new Node<Integer>(data);
//			if(head == null) {
//				head = newNode;
//				tail = newNode;
//			}else {
//				tail.next = newNode;
//				tail = tail.next; // OR tail= newNode;
//				
//			}
//			data =sc.nextInt();
//			
//		}
//		return head;
//		
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.println(getLength(head)+1);
		printLinkedList(head);
		
	}

}
