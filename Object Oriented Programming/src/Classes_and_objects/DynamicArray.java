package Classes_and_objects;

public class DynamicArray {
	private int data[];
	private int nextIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextIndex=0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public void add(int element) {
		if(nextIndex == data.length) {
			restructure();
		}
		data[nextIndex]= element;
		nextIndex++;
	}
	private void restructure() {
		int temp[]=data;
		data =new int[data.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]= temp[i];
		}
	}

	public void set(int index ,int value) {
		if(index<nextIndex) {
			data[index]= value;
		}else if(index>nextIndex) {
			return;
		}
		else {
			add(value);
		}
	}
	
	public int get(int index) {
		if(index>=nextIndex) {
			return -1;
		}else {
		return data[index];
		}
	}
	
	public int removeLast() {
		if(size()==0) {
			return -1;
		}
		int value =data[nextIndex-1];
		data[nextIndex-1] =0;
		nextIndex--;
		return value;
	
	}
	
	public boolean isEmpty() {
		if(data.length==0) {
			return true;
		}else {
			return false;
		}
	}


}
