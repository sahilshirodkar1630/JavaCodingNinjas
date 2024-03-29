package LL1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	AppendLastNToFirst
	Send Feedback
	You have been given a singly linked list of integers along with an integer 'N'.
	Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
	Input format :
	The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
	
	The first line of each test case or query contains the elements of the singly linked list separated by a single space. 
	
	The second line contains the integer value 'N'. It denotes the number of nodes to be moved from last to the front of the singly linked list.
	Remember/Consider :
	While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
	Output format :
	For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.
	
	Output for every test case will be printed in a seperate line.
	Constraints :
	1 <= t <= 10^2
	0 <= M <= 10^5
	0 <= N < M
	Time Limit: 1sec
	
	Where 'M' is the size of the singly linked list.
	Sample Input 1 :
	2
	1 2 3 4 5 -1
	3
	10 20 30 40 50 60 -1
	5
	Sample Output 1 :
	3 4 5 1 2
	20 30 40 50 60 10
	Sample Input 2 :
	1
	10 6 77 90 61 67 100  -1
	4
	Sample Output 2 :
	90 61 67 100 10 6 77 
	 Explanation to Sample Input 2 :
	We have been required to move the last 4 nodes to the front of the list. Here, "90->61->67->100" is the list which represents the last 4 nodes.
	When we move this list to the front then the remaining part of the initial list which is, "10->6->77" is attached after 100. 
	Hence, the new list formed with an updated head pointing to 90.
*/
	public class AppendLastNToFirst {
	
		public static  Node<Integer> appendLastNToFirst( Node<Integer> head, int n) {
			if(head==null || n==0) {
				return head;
			}
			 Node<Integer> temp=head;
			 Node<Integer> temp1=head;
	
			int i=0;
			while(i < n) {
				temp = temp.next;
				i++;
			}
			
			System.out.println(temp.data);
			while(temp.next !=null) {
				temp1=temp1.next;
				temp = temp.next;
			}
			System.out.println(temp.data+ " "+ temp1.data);
			
			 Node<Integer> newHead=head;
			 Node<Integer> temp2 = temp1.next;
			temp1.next=null;
			temp.next=newHead;
			head = temp2;
			
			return head;
		}
		
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static  Node<Integer> takeInput() throws IOException {
	         Node<Integer> head = null, tail = null;
	
	        String[] datas = br.readLine().trim().split("\\s");
	
	        int i = 0;
	        while (i < datas.length && !datas[i].equals("-1")) {
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
            
             Node<Integer> head = takeInput(); 

            int n = Integer.parseInt(br.readLine().trim());
            head = appendLastNToFirst(head, n);
            print(head);

            t -= 1;
        }
        
    }

}
