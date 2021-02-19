import java.util.HashMap;
import java.util.Set;

public class MapsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 1);
		map.put("def1", 2);
		map.put("abc1", 1);
		System.out.println("size : "+map.size());
		
		
//		Check Presence
		if(map.containsKey("abc")) {
			System.out.println("Has abc");
		}
		
		if(map.containsKey("abc1")) {
			System.out.println("Has abc1");
		}
		
		if(map.containsValue(2)) {
			System.out.println("Has 2 as value");
		}
		// get Value
//		int value = map.get("abc");
//		System.out.println(value);
		
		int v =0;
		if(map.containsKey("abcd")) {
			v= map.get("abcd");
		}
		System.out.println(v);
		
		//Remove
//		int s = map.remove("abc");
//		System.out.println(s);
		
		//Iterate
		Set<String> keys = map.keySet();
		for(String str : keys) {
			System.out.println(str);
		}
		
	}

}
