package Implementation;

public class Count_Words_in_Trie {

	TrieNode root;
	private int countWords(TrieNode root) {
		int count=0;
		for(int i=0;i<26;i++) {
			TrieNode child= root.children[i];
			if(child!=null) {
				if(child.isTerminating) {
					count+=1;
				}
				count+= countWords(child);
			}
		}
		return count;
	}
	
	public int countWords() {
		// Write your code here
		return countWords(root);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
