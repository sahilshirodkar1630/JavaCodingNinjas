package Problems;
import java.util.ArrayList;

import javax.sound.sampled.ReverbType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Implementation.Trie;

import java.util.ArrayList;

class TrieNode {
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Palindrome_Pair {
	/*
	 * 
	 * Given 'n' number of words, you need to find if there exist any two words
	 *  which can be joined to make a palindrome or any word, which itself is a palindrome.
		The function should return either true or false. 
		You don't have to print anything.
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
*/


	
} 