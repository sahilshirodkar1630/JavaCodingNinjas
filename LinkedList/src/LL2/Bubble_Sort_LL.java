package LL2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bubble_Sort_LL {
	/*

	Bubble Sort (Iterative) LinkedList
	Send Feedback
	Given a singly linked list of integers, sort it using 'Bubble Sort.'
	Note :
	No need to print the list, it has already been taken care. Only return the new head to the list.
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

	The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
	Remember/Consider :
	While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
	Output format :
	For each test case/query, print the elements of the sorted singly linked list.

	Output for every test case will be printed in a seperate line.
	Constraints :
	1 <= t <= 10^2
	0 <= M <= 10^3
	Where M is the size of the singly linked list.

	Time Limit: 1sec
	Sample Input 1 :
	1
	10 9 8 7 6 5 4 3 -1
	Sample Output 1 :
	 3 4 5 6 7 8 9 10 
	 Sample Output 2 :
	2
	-1
	10 -5 9 90 5 67 1 89 -1
	Sample Output 2 :
	-5 1 5 9 10 67 89 90 
	*/
	public static int length(Node<Integer> head) {
		int i=0;
		while(head!=null) {
			head = head.next;
			i++;
		}
		return i;
	}
	public static  Node<Integer> bubbleSort( Node<Integer> head )
	{
		
		for(int i=0;i<length(head);i++) {
			Node<Integer> prev = null;
			Node<Integer> current = head;
		while(current.next!=null) {
			if(current.data>current.next.data) {
				Node<Integer> next = current.next ;
				if(prev==null) {
					current.next= next.next;
					next.next= current;
					prev= next;
					head= prev;
				}else {
				
				prev.next=current.next;
				current.next=next.next;
				next.next= current;
				prev = prev.next;
				}
			}else {
				prev = current;
				current= current.next;
			}
		}
		}
		return head;
		
		
	}
// public static int len(LinkedListNode<Integer> head) {
//		 
//		 int count=0;
//		 while(head !=null) {
//			 head=head.next;
//			 count++;
//		 }
//		 return count;
// 
//	 }
//
//	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
//		 int n=len(head);
//		 
//		 int i=0;
//		 while(i<(n-1)) {
//			 LinkedListNode<Integer> current=head;
//			 LinkedListNode<Integer> prev=null;
//			 
//			 for(int j=0;j<n-i-1;j++) {
//				 if(current.data<=current.next.data) {
//					 prev=current;
//					 current=current.next;
//				 }else {
//					 if(prev==null) {
//						LinkedListNode<Integer> next = current.next;
//                        head=head.next;
//                         current.next= next.next;
//                         next.next=current;
//                         prev = next;
//					 }else {
//                         LinkedListNode<Integer> next = current.next;
//                          prev.next=next;
//                         current.next = next.next;
//                         next.next=current;
//                         prev=next;
//					 }
//				 }
//			 }
//			 i++;
//		 }
//		 
//		return head; 
//	}
	
	
	  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static  Node<Integer> takeInput() throws IOException {
	         Node<Integer> head = null, tail = null;

	        String[] datas = br.readLine().trim().split("\\s");

	        int i = 0;
	        while(i < datas.length && !datas[i].equals("-1")) {
	            int data = Integer.parseInt(datas[i]);
	             Node<Integer> newNode = new  Node<Integer>(data);
	            if(head == null) {
	                head = newNode;
	                tail = newNode;
	            }
	            else {
	                tail.next = newNode;
	                tail = newNode;
	            }
	            i += 1;
	        }

	        return head;
	    }
	    
	    public static void print( Node<Integer> head){
	        while(head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        
	        System.out.println();
	    }
	    
	    public static void main(String[] args) throws NumberFormatException, IOException {
	    	 Node<Integer> head = takeInput(); 

	    	head = bubbleSort(head);
	    	print(head);
	    }

}
