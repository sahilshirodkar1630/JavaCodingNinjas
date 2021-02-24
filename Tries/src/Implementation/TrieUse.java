package Implementation;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie t = new Trie();
		t.add("this");
		t.add("news");
		System.out.println(t.search("this"));
//		t.remove("this");
		System.out.println(t.search("this"));
		System.out.println(t.countWords());
	}

}
