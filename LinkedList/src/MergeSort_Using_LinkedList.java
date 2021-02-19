import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MergeSort_Using_LinkedList {


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
