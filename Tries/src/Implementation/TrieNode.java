package Implementation;

public class TrieNode {
	char data;
	boolean isTerminating;
	TrieNode children[];
	 
	public TrieNode(char data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
	}

}
