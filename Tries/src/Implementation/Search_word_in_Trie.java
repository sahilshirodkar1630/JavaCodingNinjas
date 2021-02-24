package Implementation;

import Implementation.Trie;
public class Search_word_in_Trie {

	TrieNode root;
	
	private  boolean search(TrieNode root, String word ) {
		if(word.length()==0) {
			return root.isTerminating ;	
		}	
		int childIndex = word.charAt(0) -'a';
		TrieNode child = root.children[childIndex];
		if(child != null) {
			return search(child,word.substring(1));
		}
		 
		return false;
		
	}
	
	public boolean search(String word) {
		
		return search(root,word);
	}
}
