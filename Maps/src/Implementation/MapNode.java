package Implementation;

public class MapNode<K,V> {
	K key;
	V value;
	MapNode<K, V> next;
	public MapNode(K key,V value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
	}
}
