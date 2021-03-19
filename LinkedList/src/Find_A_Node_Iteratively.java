import java.util.Scanner;

public class Find_A_Node_Iteratively {

	/*
	
	You have been given a singly linked list of integers. 
	Write a function that returns the index/position of an integer data denoted by 'N' (if it exists). 
	Return -1 otherwise.
	
	*/
	public static int findNode(Node<Integer> head, int n) {
		if(head==null) {
			return -1;
		}
		int count=0;
		while(head != null) {			
			
			if(head.data == n) {
				return count;
			}
			count++;
			head = head.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head =takeInput();
		
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
	

}
