package LL2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort_Using_LinkedList {
	/*
	Merge Sort
	Send Feedback
	 Given a singly linked list of integers, sort it using 'Merge Sort.'
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
	0 <= M <= 10^5
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
	    private static  Node<Integer> merge( Node<Integer> head1, Node<Integer> head2){
	       
	        if(head1==null){
	            return head2;
	        }
	        if(head2 == null){
	            return head1;
	        }
	         Node<Integer> temp = head1;
	    	

	        if(head1.data<head2.data){
	            temp = head1;
	            head1 = head1.next;
	        }else{
	            temp = head2;
	            head2 =head2.next;
	        }
	          Node<Integer> head3  = temp;
	        
	        
	        while(head1!=null&&head2!=null){
	         if(head1.data>head2.data) {
	             temp.next =head2;
	                 temp = head2;
	             head2 = head2.next;
	         }  else{
	             temp.next =head1;
	             temp= head1;
	             head1 = head1.next;
	             
	         }
	        }
	        if(head2==null){
	            temp.next= head1;
	        } else{
	            temp.next= head2;
	        }
	        return head3;
	    }
	    

		public static  Node<Integer> mergeSort( Node<Integer> head) {
			//Your code goes here
	        if(head==null||head.next==null){
	            return head;
	        }
	         Node<Integer> mid = midPoint(head);
	         Node<Integer> head2 = mid.next;
	        mid.next= null;
	        
	        head =mergeSort(head);
	        head2 =mergeSort(head2);
	        return merge(head,head2);
	        
	        
	        
	        
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
    
    public static void print( Node<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        
            
             Node<Integer> head = takeInput();

             Node<Integer> newHead = mergeSort(head);
            print(newHead);
            
        
       

    }
}
