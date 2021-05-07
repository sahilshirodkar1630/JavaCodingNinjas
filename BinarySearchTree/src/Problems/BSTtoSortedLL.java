package Problems;

public class BSTtoSortedLL {

	public static class Pair{
		 Node<Integer>head;
		 Node<Integer>tail;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static  Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		return constructLinkedListHelper(root).head;
	}
       
    public static Pair constructLinkedListHelper(BinaryTreeNode<Integer> root) {
		if(root==null) {
			Pair pair = new Pair();
			return pair;
		}		
		
		 Node<Integer> newNode = new  Node<Integer>(root.data);
		Pair leftList =constructLinkedListHelper(root.left);
		Pair rightList =constructLinkedListHelper(root.right);
		Pair pair = new Pair();
		if(leftList.tail != null) {
			leftList.tail.next = newNode;
		}
		
		newNode.next = rightList.head;
		
		if(leftList.head != null) {
			pair.head = leftList.head;
		}else {
			pair.head =newNode;
		}
		
		if(rightList.tail != null) {
			pair.tail = rightList.tail;
		}else {
			pair.tail =newNode;
		}
		return pair;
	}
}
