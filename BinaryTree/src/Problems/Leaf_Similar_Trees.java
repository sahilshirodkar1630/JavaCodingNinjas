package Problems;

import java.util.ArrayList;
import java.util.Scanner;

import Implementation.BinaryTreeNode;

public class Leaf_Similar_Trees {


    public static ArrayList<Integer> getLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return new ArrayList<Integer>();
        }
        if(root.left==null && root.right==null){
            ArrayList<Integer> output = new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> output =getLeaf(root.left);
        ArrayList<Integer> rOutput= getLeaf(root.right);
        for(int i=0;i<rOutput.size();i++){
            output.add(rOutput.get(i));
        }
        return output;
        
    }
    
    public static boolean leafSimilar(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        ArrayList<Integer> root1Array = getLeaf(root1);
         ArrayList<Integer> root2Array = getLeaf(root2);
        if(root1Array.size()==root2Array.size()){
            boolean isSimilar=true;
            for(int i=0;i<root1Array.size();i++){
                if(root1Array.get(i)!=root2Array.get(i)){
                    isSimilar=false;
                    break;
                }
            }
            return isSimilar;
        }else{
            return false;
        }
        
    }
    
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			try {
				BinaryTreeNode<Integer> frontNode = queue.dequeue();
				System.out.println("Enter left child of "+ frontNode.data);
				int left =sc.nextInt();
				if(left !=-1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<Integer>(left);
				frontNode.left= leftNode;
				queue.enqueue(leftNode);
				}
				System.out.println("Enter right child of "+ frontNode.data);
				int right =sc.nextInt();
				if(right!=-1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<Integer>(right);
				frontNode.right= rightNode;
				queue.enqueue(rightNode);
	
				}
				
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return root;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root1 = takeInputLevelWise();
		BinaryTreeNode<Integer> root2 = takeInputLevelWise();
		boolean ans = leafSimilar(root1, root2);
		System.out.println(ans);
	}

}
