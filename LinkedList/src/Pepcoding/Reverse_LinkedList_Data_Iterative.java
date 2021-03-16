package Pepcoding;

import java.util.Scanner;

public class Reverse_LinkedList_Data_Iterative {
	
	private static Node<Integer> getNodeAT(Node<Integer> head,int index) {
		if(index ==0|| head==null) {
			return head;
		}
		Node<Integer> temp = head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public static Node<Integer> ReverseDataIterartive(Node<Integer> head){
		int i=0;
		int j=0;
		Node<Integer> temp = head;
		while(temp.next!=null) {
			temp=temp.next;
			j++;
		}
		
		while(i<j) {
			
			Node<Integer> first = getNodeAT(head, i);
			Node<Integer> last = getNodeAT(head, j);
			i++;
			j--;
			int val = first.data;
			first.data= last.data;
			last.data= val;
		}
		
		return getNodeAT(head, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head = takeInput();
		head= ReverseDataIterartive(head);
		print(head);
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
