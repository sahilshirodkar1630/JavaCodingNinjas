
public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public T front() {
		return front.data;
	}
	
	public void enqueue(T  element) {
		Node<T> temp = new Node<T>(element);
		if(size==0) {
			front = temp;
			rear = temp;
			size++;
			return;
			
		}
		rear.next= temp;
		rear = rear.next;
		size++;
	}
	public T dequeue() throws QueueEmptyException {
		if(size==0) {
			QueueEmptyException e =new QueueEmptyException();
			throw e;
		}
		T val =  front.data;
		front=front.next;
		size--;
		return val;
	}
	
	
	
	
	
	
}
