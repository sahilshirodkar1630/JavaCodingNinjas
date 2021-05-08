package LL2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DeleteElement_Recursively {

	 
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
            int pos = Integer.parseInt(br.readLine().trim());

             Node<Integer> newHead = deleteNodeRec(head, pos);
            print(newHead);
            
        

    }

	public static  Node<Integer> deleteNodeRec( Node<Integer> head, int pos) {
    	//Your code goes here
          if(head==null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
      
        head.next = deleteNodeRec(head.next,pos-1);
        return head;
	}


}
