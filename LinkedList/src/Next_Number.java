import java.util.Scanner;
public class Next_Number {

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
	private static Node<Integer> newNode(int data){
		Node<Integer> newNode = new Node<Integer>(data);
		newNode.data= data;
		newNode.next = null;
		return newNode;
	}
	public static  Node<Integer> nextLargeNumber( Node<Integer> head) {
         Node<Integer> temp = null;
         Node<Integer> ans = head;
        
        head = Reverse(head);
        ans = head;
        int carry=1,sum;
        while(head!=null) {
        	sum= carry+head.data;
        	if(sum>=10) {
        		carry= 1;
        	}else {
        		carry=0;
        	}
        	sum=sum%10;
        	head.data=sum;
        	temp=head;
        	head = head.next;
        	
        }
        if(carry>0) {
        	temp.next= newNode(carry);
        	
        }
        ans= Reverse(ans);
        
        
   
        return ans;
	}
	static Scanner s = new Scanner(System.in);

	public static  Node<Integer> takeInput() {
		 Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			 Node<Integer> newNode = new  Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print( Node<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		
		  Node<Integer> head = takeInput();
		head = nextLargeNumber(head);
		print(head);
		
	}
}
