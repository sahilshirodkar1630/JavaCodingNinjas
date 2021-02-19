package Classes_and_objects;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicArray d= new DynamicArray();
		for(int i=0;i<50;i++) {
			d.add(i);
		}
		System.out.println(d.size());
		
		d.set(3, 20);
		System.out.println(d.get(3));
		System.out.println(d.isEmpty());
		System.out.println(d.removeLast());
		System.out.println(d.get(27));
		System.out.println(d.size());
		
	}

}
