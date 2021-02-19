import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_LinkedList {

	/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/
	
	
//	Sample Input 1 :
//	
//	  	1
//		9 2 3 3 2 9 -1
//		Sample Output 1 :
//		true
//		Sample Input 2 :
//		2
//		0 2 3 2 5 -1
//		-1
//		Sample Output 2 :
//		false
//		true
	
	public static  Node<Integer> Reverse( Node<Integer> head){
	       
		Node<Integer> current = head;
		Node<Integer>  prev = null;
		Node<Integer>  next = null;
        while(current!=null) {    
        	next= current.next;
        	current.next = prev;
        	prev = current;
        	current=next;
        }
        head = prev;
        return head;
    }

	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		if(head==null) {
			return true;
		}
		if(head.next==null) {
			return true;
		}
		
        Node<Integer> temp = head;
        int i=0;
        while(temp != null){
            temp = temp.next;
            i++; 
        }
        int midpoint =i/2;
         i=0;temp=head;
        while(i<midpoint-1){
            temp = temp.next;
            System.out.println(temp.data);
            i++;
        }
         Node<Integer> head2 =temp.next;
//         System.out.println(head.data+" "+head2.data);
        temp.next=null;
        head2 = Reverse(head2);
//        print(head);
//        print(head2);
        Node<Integer> temp1 = head;
        Node<Integer> temp2 = head2;
        
        boolean isTrue= false;
        while(temp1!=null && temp2!=null) {
        	isTrue = false;
//        	System.out.println(temp1.data+" "+temp2.data);
        	if(temp1.data.equals(temp2.data)) {
        		isTrue = true;
        	}
        	
        	temp1 = temp1.next;
        	temp2 = temp2.next;
        	
        }
        
        return isTrue;
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
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

             Node<Integer> head = takeInput(); 

            boolean ans = isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }
        
    }

}
