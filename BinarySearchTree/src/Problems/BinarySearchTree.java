package Problems;

public class BinarySearchTree {
	BinaryTreeNode<Integer> root;
	private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int data) {
		//Implement the insert() function
		if(root == null) {
			BinaryTreeNode<Integer> ans = new BinaryTreeNode<Integer>(data);
			return ans;
		}
		
		if(data>root.data) {
			root.right =insert(root.right, data);
		}else {
			root.left = insert(root.left, data);
		}
		return root;
	}
	public void insert(int data) {
		//Implement the insert() function
		root =   insert(root, data);
		
	}
	

	private BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root ,int data) {
		//Implement the remove() function
		if(root == null) {
			return null;
		}
		if(root.data>data) {
			root.left = remove(root.left, data);
			return root;
		}else if(root.data<data) {
			root.right = remove(root.right, data);
			return root;
		} else{
			if(root.left==null&& root.right == null) {
				return null;
			}
			else if ( root.left == null && root.right!= null) {
				return root.right;
			}
			else if ( root.left != null && root.right== null) {
				return root.left;
			}else {
				BinaryTreeNode<Integer> minimum = root.right;
				while(minimum.left!= null) {
					minimum = minimum.left;
				}
				root.data = minimum.data;
				root.right = remove(root.right,minimum.data);
				return root;
			}
		}
		
	}
	public void remove(int data) {
		//Implement the remove() function
		root = remove(root, data);
	}
	
	private static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		QueueUsingLL<BinaryTreeNode<Integer>> queue =  new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			
			BinaryTreeNode<Integer> frontNode;
			try {
				frontNode = queue.dequeue();
				String s = frontNode.data+":";
				if(frontNode.left==null) {
					s+= "L:-1"+",";
				}else {
					s+="L:"+frontNode.left.data+",";
					queue.enqueue(frontNode.left);
				}
				
				if(frontNode.right==null) {
					s+= "R:-1";
				}else {
					s+="R:"+frontNode.right.data;
					queue.enqueue(frontNode.right);
				}
				System.out.println(s);
				
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		   
		
	}
	public void printTree() {
		//Implement the printTree() function
		printLevelWise(root);
		
	}
	
	private boolean searchHelper(int data,BinaryTreeNode<Integer> root ) {
		if(root==null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		boolean ans = searchHelper(data,root.left);
		if(ans) {
			return true;
		}
		ans = searchHelper(data, root.right);
		return ans;
		//Implement the search() function
	}
	public boolean search(int data) {
		//Implement the search() function
		return searchHelper(data, root);
	}

}
