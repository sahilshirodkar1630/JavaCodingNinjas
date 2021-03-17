package Pepcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MergeTwoSortedLL {
	
	

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
	        
	        int t = Integer.parseInt(br.readLine().trim());

	        while (t > 0) {
	            
	             Node<Integer> head1 = takeInput(); 
	             Node<Integer> head2 = takeInput(); 

	             Node<Integer> newHead =mergeTwoSortedLinkedLists(head1, head2);
	            print(newHead);
	            
	            t -= 1;
	        }

	    }
	    
	    
	    public static Node<Integer> insert(Node<Integer> tail,int val) {
	    	Node<Integer> node =new Node<Integer>(val);
	    	if(tail==null) {
	    		return node;
	    	}
	    	
	    	tail.next= node;
	    	return node;
	    	
	    }
	    
	    
		private static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
			// TODO Auto-generated method stub
			Node<Integer> one = head1;
			Node<Integer> two = head2;
			Node<Integer> tail=null;
			if(one.data<two.data) {
				tail =insert(tail, one.data);
				one = one.next;
			}else {
				tail =insert(tail, two.data);
				two = two.next;
			}
			
			Node<Integer> newHead = tail;
			
			while(one!=null&&two!=null) {
				if(one.data<two.data) {
					tail =insert(tail, one.data);
					one=one.next;
				}else {
					tail =insert(tail, two.data);
					two = two.next;
				}
			}
			while(one!=null) {
				System.out.println(one.data);
				tail =insert(tail, one.data);
				one=one.next;
			}
			while(two!=null) {
				tail =insert(tail, two.data);
				two=two.next;
			}
			return newHead;
		}

}
