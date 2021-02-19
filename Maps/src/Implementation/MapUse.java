package Implementation;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new Map<String, Integer>();
		for(int i=0;i<20;i++) {
			map.insert("abc"+i, 1+i);
			System.out.println("i - "+ i+" if -"+ map.loadFactor());
		}
		
		System.out.println(map.removeKey("abc3"));
		
		for(int i = 0; i< 20;i++) {
			System.out.println("abc"+i+":"+map.getValue("abc"+i));
		}
	}

}
	