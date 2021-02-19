package Problems;

import java.util.Scanner;

public class Height_Of_Tree {
	
	
//	Approach 1
//	public static int getHeight(TreeNode<Integer> root){
//		/* Your class should be named Solution
//		 * Don't write main().
//		 * Don't read input, it is passed as function argument.
//		 * Return output and don't print it.
//		 * Taking input and printing output is handled automatically.
//		 */
//		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<TreeNode<Integer>>();
//		
//		queue.enqueue(root);
//		int count =0;
//		while(!queue.isEmpty()) {
//		int rootsize = queue.size();
//		while(rootsize!=0) {
//			try {
//				TreeNode<Integer> frontNode = queue.dequeue();
//				for(int i=0;i<frontNode.children.size();i++) {
//					queue.enqueue(frontNode.children.get(i));
//				}
//			} catch (QueueEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			rootsize--;
//			
//		}
//		count ++;
//		}
//		return count;
//		
//	}


	public static int getHeight(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int ans =0;
		 for(TreeNode<Integer> child : root.children) {
			 int childHeight = getHeight(child);
			 if(childHeight > ans) {
				 ans = childHeight;
			 }
		 }
		 return ans+1;
		
	}
	public static TreeNode<Integer> takeTreeInputLevelWise(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> fronNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of "+ fronNode.data);
				int numChildren = sc.nextInt();
				for(int i=0;i<numChildren;i++) {
					System.out.println("Enter "+(i+1)+"th child of "+fronNode.data);
					int child = sc.nextInt();
					TreeNode<Integer> childNode = new  TreeNode<Integer>(child);
					fronNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				///Shouldnt come here
				return null;
			}
			
		}
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TreeNode<Integer> root = takeTreeInputLevelWise();
		System.out.println(getHeight(root));
				
	}

}
