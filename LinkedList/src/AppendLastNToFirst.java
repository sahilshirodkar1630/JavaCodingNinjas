import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
