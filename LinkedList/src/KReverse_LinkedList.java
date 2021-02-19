import java.util.Scanner;
 class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	
}
public class KReverse_LinkedList {
	
	public static void print(Node<Integer> head) {


		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
			}
			System.out.println();
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
	public static Node<Integer> kReverse(Node<Integer> head, int k) {

		
		int count =0;
		Node<Integer> temp = head;
		while(count<k-1) {
			if(temp.next==null) {
				break;
			}
			
			temp = temp.next;
			count ++;
		}
		if(temp.next==null) {
			DoubleNode dn = ReverseDN(head);
			
			return  dn.head;
			
		}
		Node<Integer> t2 =kReverse(temp.next, k);
		temp.next=null;
		DoubleNode dn = ReverseDN(head);
		dn.tail.next= t2;
		return  dn.head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer>  head = takeInput();
		head = kReverse(head, 0);
		print(head);
	}

}
