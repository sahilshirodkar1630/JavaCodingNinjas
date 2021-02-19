import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bubble_Sort_LL {

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
