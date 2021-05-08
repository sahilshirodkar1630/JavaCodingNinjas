package LL1;
import java.util.Scanner;



public class LinkedListUse {
	public static class DoubleNode{
		Node<Integer> head;
		Node<Integer> tail;
	}

	public static void print(Node<Integer> head) {


		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
			}
			System.out.println();
	}
	
//	public static Node<Integer> TakeInput()// O(n^2)
//	{
////		O(n^2)
//		Node<Integer> head = null; 
//		Scanner sc = new Scanner(System.in);
//		int data = sc.nextInt();
//		
//		while(data != -1) {
//			Node<Integer> newNode = new Node<Integer>(data);
//			if(head == null) {
//				head = newNode;
//			}else {
//				Node<Integer> temp = head;
//				while(temp.next != null) {
//				temp= temp.next;	
//				}
//				temp.next = newNode;
//				
//			}
//			data =sc.nextInt();
//			
//		}
//		return head;
//		
//		
//	}
	
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
	
	public  static Node<Integer> insertNode(Node<Integer> head,int data,int pos)
	{
		Node<Integer>  newNode = new Node<Integer>(data);
		if(pos == 0) {
			newNode.next = head;
			
			return newNode;
		}
		int i=1;
		Node<Integer> temp = head;
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
		return head;
		
	}
	public static  Node<Integer> deleteNode( Node<Integer> head, int pos) {
		//Your code goes here
         Node<Integer> temp = head;
        if(pos ==0){
            return head.next;
        }
        int i=0;
        while(i<pos-1){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
            i++;
        }
        if(temp.next == null){
            return head;
        }
         Node<Integer> temp2= temp.next;
        temp.next=temp2.next;
        return head;
        
	}
	public static DoubleNode ReverseDN( Node<Integer> head){
	       
		if(head == null||head.next==null){
            DoubleNode dn = new DoubleNode();
            dn.head= head;
            dn.tail= head;
            return dn;
        }
        
         Node<Integer> current = head;
         Node<Integer> prev = null;
         Node<Integer> next = null;
        
        while(current != null){
          next = current.next;
          current.next= prev;
          prev =current;
          
          
          current = next;
            
        }
        DoubleNode ans = new DoubleNode();
        ans.head = prev;
        ans.tail = head;
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Node <Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3  = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		
//
//		print(head);
//		print(head);
		
		Node<Integer>  head = takeInput();
//		print(head);
//		
//		head = insertNode(head, 35, 0);
//
//		print(head);
//		head = deleteNode(head, 0);
//		head = insertNode(head, 25,3);
		print(head);
		head = insertNode(head, 8, 1);
		print(head);
	}

}
