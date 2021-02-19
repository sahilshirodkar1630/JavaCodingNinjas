import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println(list1.size());
		for(int i=0;i<25;i++) {
			list1.add(12*i);
		}
		System.out.println(list1.size());
		System.out.println(list1.get(10));
		list1.add(10, 20);
	
		
	for(int i=0;i<list1.size();i++) {
		System.out.print(list1.get(i)+" ");
	}
	System.out.println();

//	For each loop
	for(int elem: list1) {
		System.out.print(elem+" ");
	}
//	list1.remove(10);
//	for(int i=0;i<list1.size();i++) {
//		System.out.print(list1.get(i)+" ");
//	}
//	System.out.println();
//	list1.set(10, 2000);
//	for(int i=0;i<list1.size();i++) {
//		System.out.print(list1.get(i)+" ");
//	}
	
	
//	System.out.println(list1.get(50)); Index out of Bonds
}
}
