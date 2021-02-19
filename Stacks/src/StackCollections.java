import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<=10;i++) {
			stack.push(i*i);
		}
		System.out.println(stack.peek());

		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
