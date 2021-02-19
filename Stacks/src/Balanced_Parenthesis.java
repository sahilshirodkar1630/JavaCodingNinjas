import java.util.Stack;

public class Balanced_Parenthesis {

	 public static boolean isBalanced(String str) {
	        //Your code goes here
		 Stack<Character> s= new Stack<Character>();
		 boolean isTrue=true;
			int i=0;
			while(i<str.length()){
				if(str.charAt(i)=='(') {
					s.push(str.charAt(i));
				}
				if(str.charAt(i)==')') {
					if(s.isEmpty()) {
						isTrue=  false;
						break;
					}
					if(s.peek()=='(') {
						s.pop();
					}else {
						isTrue=false;
						break;
					}
				}
				i++;
			}
			if(!s.isEmpty()) {
				isTrue= false;
			}
			return isTrue;
			
			
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  ="(()()())";
		System.out.println(isBalanced(str));
		
	}

}
