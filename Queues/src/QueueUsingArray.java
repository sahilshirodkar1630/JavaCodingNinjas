
public class QueueUsingArray {

	private int data[];
	private int front; //Index  at which front element is stored
	private int rear; //Index at which  last element is stored
	private int size;
	
	public QueueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
		
	}
	
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return(front == -1);
	}
	
	public int front() throws QueueEmptyException {
		if(front ==-1) {
			QueueEmptyException e = new  QueueEmptyException();
			throw e;
		}
		return data[front];
	}
	
	private void doubleCapacity() {
		int temp[]=  data;
		data = new int[temp.length*2];
		int index=0;
		for(int  i=front;i<temp.length;i++) {
			data[index]=temp[i];
			index++;
		}
		for(int  i=0;i<=front-1;i++) {
			data[index]=temp[i];
			index++;
		}
		front =0;
		rear = temp.length-1;
	}
	
	public void enqueue(int element) {
		if(size==data.length) {
			doubleCapacity();
		}
		if(size()==0) {
		front=0;
		}
		rear++;
		size++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = element;
	}
	public int dequeue() throws QueueEmptyException {
		if(size() ==0) {
			QueueEmptyException e = new  QueueEmptyException();
			throw e;
		}
		int temp = data[front];
		front++;
		if(front == data.length) {
			front = 0;
		}
		size--;
		if(size == 0) {
			front = -1;
			rear =  -1;
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
}
