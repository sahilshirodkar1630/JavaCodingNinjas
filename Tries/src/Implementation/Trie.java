package Implementation;

import java.util.ArrayList;



public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	// Inserting a word in a Trie
	private void add (TrieNode root,String word) {
		if(word.length()==0){
			root.isTerminating= true;
			return;
		}
		int childIndex = word.charAt(0) -'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex]= child;
		}
		add(child,word.substring(1));
	}
	public void add(String word) {
	
		add(root,word);
		
	}
	
	// Searching a word in a Trie
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
	
	// Removing a word from a Trie
	private void remove(TrieNode root,String word) {
		
		if(word.length()==0){
			root.isTerminating = false;
			return;
		}
		int childIndex = word.charAt(0) -'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return ;
		}
		remove(child,word.substring(1));
		//We can remove child node only if it is non terminating and its number of children are 0.
		if(!child.isTerminating) {
			int numChild = 0;
			for(int i=0;i<26;i++) {
				if(child.children[i] != null) {
					numChild++;
				}
			}
			if(numChild==0) {
				root.children[childIndex]= null;
				child=null;
			}
		}
	}
	public void remove(String word) {
		remove(root,word);
	}
	
	//Counting Words in a Trie
	
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
	
	
	private static String reverseString (String word) {
		
        if(word.length()==0) {
			return "" ;
		}
	 
        return reverseString(word.substring(1))+word.charAt(0);
        
	}


	public boolean isPalindromePair(ArrayList<String> words) {
	//Your code goes here
		for(int i=0;i<words.size();i++) {
	         int val=words.get(i).length();     
	         int j=0;
	     	   while(j<val){
	            	add(root,words.get(i).substring(j));
	                j++;
	           }
		}
    
	    boolean isPair = false;
	    
	    for(int i=0;i<words.size();i++) {
	        String str = reverseString(words.get(i));
				if(search(str)) {
				isPair=true;
				break;
			}  
	    }
    
	    return isPair;
	}
	
	
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

}
