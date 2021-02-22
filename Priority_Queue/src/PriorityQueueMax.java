import java.util.ArrayList;

public class PriorityQueueMax {
	private ArrayList<Integer> heap;
	
	public PriorityQueueMax() {
		heap = new ArrayList<Integer>();
	}
	
	
	 boolean isEmpty() {
		return heap.size() == 0;
	}
	 int size() {
			return heap.size();
		}
	 
	 int getMax() throws PriorityQueueEmptyException {
			if(isEmpty()) {
				//Throw an Exception
				throw new PriorityQueueEmptyException();
				
			}
			return heap.get(0);
	}
	 void print(ArrayList<Integer> array) {
			for(int i=0;i<heap.size();i++) {
				System.out.print(heap.get(i)+" ");
			}System.out.println();
	 }
	 void insert (int element) {
			heap.add(element);	
			int childIndex = heap.size() - 1;
			int parentIndex = (childIndex - 1)/2;
			while(childIndex >0) {
				if(heap.get(childIndex) > heap.get(parentIndex)) {
					int temp = heap.get(childIndex);
					heap.set(childIndex, heap.get(parentIndex));
					heap.set(parentIndex,temp);
					childIndex= parentIndex;
					parentIndex=(childIndex-1)/2;
				}else {
					return;
				}
			}
			
	 }
	 
	 int removeMax() {
			// Complete this function
			// Throw the exception PriorityQueueException if queue is empty
//	        if (isEmpty()) {
//				throw new PriorityQueueEmptyException();
//			}
		    int maximum = heap.get(0);
			heap.set(0,heap.get(heap.size()-1)); 	
			heap.remove(heap.size()-1);
			int parentIndex = 0;
			int index = parentIndex;
			int leftChildIndex =1;
			int rightChildIndex = 2;
			
			
			while(leftChildIndex < heap.size()) {
				if(heap.get(leftChildIndex)>heap.get(index)) {
					 index= leftChildIndex;
				}
	            if(rightChildIndex<heap.size() && heap.get(rightChildIndex) > heap.get(index)){
					 index= rightChildIndex;
				}
				if(index==parentIndex) {
					break;
				}else {
					int temp = heap.get(parentIndex);
					heap.set(parentIndex, heap.get(index));
					heap.set(index, temp);
					parentIndex=index;
				 leftChildIndex= 2*parentIndex+1;
		         rightChildIndex = 2*parentIndex+2;
				}
				
			}
			return maximum;
	        
	    }
}
