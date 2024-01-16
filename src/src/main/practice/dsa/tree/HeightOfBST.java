package src.main.practice.dsa.tree;

import java.util.LinkedList;

/*
  Explanation
	In-order Traversal (left,root,right)
		14 17 40 54 62 71 76 80 94 
	Pre-order Traversal (root,left,right)
		40 17 14 76 54 71 62 94 80 
	Post-order Traversal (left,right,root)
		14 17 62 71 54 80 94 76 40 
		
	from the above Post-order and Pre-order it is said that 40 is root node
	root=89
	now from the in-order the tree structure will be
			40--->level=0,height=1
			/ \
		  17   76--->level=0,height=2
		  /    / \
		 14    54 71--->level=1,height=3
		        \   \
		         62  80--->level=2,height=4
		              \
		              94--->level=3,height=5   
 */

public class HeightOfBST {

	public static void main(String[] args) {
		LinkedList<Integer> order = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			order.add((int) (Math.random() * 100 - 30) + 30);
			BinarySearchTree.addNode(order.get(i));
		}
		System.out.println(order);
		BinarySearchTree.printAllTravesals();

		System.out.println("\n Height of BST :: " + findDepth(BinarySearchTree.root));
	}

	private static int findDepth(TreeNode root) {
		if (root == null)
			return 0;
		int leftDepth = findDepth(root.left);
		int rightDepth = findDepth(root.right);
		if (leftDepth > rightDepth)
			leftDepth += 1;
		else
			rightDepth += 1;
		return Math.max(leftDepth, rightDepth);
	}

}
