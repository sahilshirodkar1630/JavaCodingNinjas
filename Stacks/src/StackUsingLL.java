
public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return(head==null);
	}
	public T top() throws StackEmptyException {
		if(head==null) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	
	public void push(T data) {
		Node<T> temp = new Node<T>(data);
		temp.next=head;
		head= temp;
		size++;
	}
	public T pop() {
	T temp = head.data;
		head = head.next;
		size--;
		return temp;

	}

	

}
