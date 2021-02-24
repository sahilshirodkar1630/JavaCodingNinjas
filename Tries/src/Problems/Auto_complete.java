package Problems;

import java.util.ArrayList;

public class Auto_complete {

//	Given n number of words and an incomplete word w. 
//	You need to auto-complete that word w.
//	That means, find and print all the possible 
//	words which can be formed using the incomplete word w.
//	Note : Order of words does not matter.
	
/*
 * Refer add search function from Trie class
 * 
	private TrieNode findWord(TrieNode root,String word) {
		if(word.length()==0) {
			return root;
		}
		for(int i=0;i<26;i++) {
			TrieNode child = root.children[i];
			if(child!=null) {
				if(child.data==word.charAt(0)) {
					return findWord(child, word.substring(1));
				}
			}
		}
		return null;
	}
	public void allPossibleWord(TrieNode root, String word) {
		if(root.isTerminating) {
			System.out.println(word);
		}
		for(int i=0;i<26;i++) {
//			String output = "";
			TrieNode child = root.children[i];
			if(child!=null) {
				allPossibleWord(child, word+child.data);
			}
		}
	}
	
	public void autoComplete(ArrayList<String> input, String word) {

		for(String i:input) {
			add(i);
		}
		
		TrieNode ans = findWord(root,word);
		if(ans!=null) {
			allPossibleWord(ans, word);
		}
    }
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
