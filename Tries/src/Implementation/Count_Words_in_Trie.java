package Implementation;

public class Count_Words_in_Trie {

//	You are given the Trie class with following functions -
//	1. insertWord
//	2. removeWord
//	Now, you need to create one more function (named "countWords" ) 
//	which returns the number of words currently present in Trie in O(1) time complexity
	
//Approach : We are using recursive approach for this  	
//	1.First go to every TrieNode and check whether its not null 
//	  i) if Yes move to Stepp 2;
//	  ii) If No check the next TrieNode
//	2.Check whether that node isTerminating 
//	   i)if Yes Increment the count by 1;
//	   ii) if No pass the childroot to recursion and increment the count by the recursion output; 
//	3. Return the count;
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
