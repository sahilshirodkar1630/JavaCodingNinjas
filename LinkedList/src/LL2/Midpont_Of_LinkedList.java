package LL2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Midpont_Of_LinkedList {
//	Code : Midpoint of Linked list
	
//	Send Feedback
//	For a given singly linked list of integers, find and return the node present at the middle of the list.
//	Note :
//	If the length of the singly linked list is even, then return the first middle node.
//
//	Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data values are, 20 and 30. We return the first node with data 20.
//	 Input format :
//	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//	The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space. 
//	Remember/Consider :
//	While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
//	 Output Format :
//	For each test case/query, print the data value of the node at the middle of the given list.
//
//	Output for every test case will be printed in a seperate line.
//	Constraints :
//	1 <= t <= 10^2
//	0 <= M <= 10^5 
//	Where M is the size of the singly linked list.
//
//	Time Limit: 1sec
//	Sample Input 1 :
//	1
//	1 2 3 4 5 -1
//	Sample Output 1 :
//	3
//	Sample Input 2 :
//	2 
//	-1
//	1 2 3 4 -1
//	Sample Output 2 :
//	2
//	

	 public static  Node<Integer> midPoint( Node<Integer> head) {
	        //Your code goes here
	        if(head == null||head.next==null){
	            return head;
	        }
	         Node<Integer> slow = head;
	         Node<Integer> fast = head;
	        
	        while(fast.next !=null){
	            fast=fast.next.next;
	           if(fast == null){
	               break;
	           }
	            slow= slow.next;
	        }
	        return slow;
	    }
	 
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

	             Node<Integer> mid = midPoint(head);
	            
	            if (mid != null) {
	                System.out.println(mid.data);
	            }

	           
	        }

	    
}
