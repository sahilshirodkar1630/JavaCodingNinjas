import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_LinkedList_Recursive {

	public static  Node<Integer> reverseLinkedListRec( Node<Integer> head) {
		//Your code goes here
         Node<Integer> temp =  head.next;
        if(temp.next== null){
           head.next = null;
            temp.next = head;
            System.out.println(temp.data+" "+temp.next.data);
            return temp;
        }
        
         Node<Integer> smallAns = reverseLinkedListRec(head.next);
         temp= smallAns;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return smallAns;
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
        
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
             Node<Integer> head = takeInput();

             Node<Integer> newHead = reverseLinkedListRec(head);
            print(newHead);
            
            t -= 1;
        }

}
}
