import java.util.Deque;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingArray q= new QueueUsingArray(3);
		for(int i=1;i<=7;i++) {
			q.enqueue(i);
		}
		
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		
		
		QueueUsingLL<Integer> l = new QueueUsingLL<Integer>();
		
	}

}
