package src.main.practice.dsa.tree;

/*

Input:            1                    1
                /   \                /   \
               2      3             3      2
              /                    			\
             4                   			 4

from lefttree.left should match with righttree.right

Output: Both trees are identical



Input:            1                    1
                /   \                /   \
               2     3              2      3
                      \            			\
                      4             	     4

Output: Trees are not identical 
*/
public class MirrorBST {
	public static void main(String[] args) {
		BinarySearchTree bst1 = new BinarySearchTree();
//		for (int i = 0; i < 10; i++) {
//			int data = (int) (Math.random() * 100 - 30) + 30;
//			bst1.addNode(data);
//		}
		// 5 6 1 2 4
		bst1.addNode(10);
		bst1.addNode(16);
		bst1.addNode(20);
		bst1.addNode(2);
		bst1.addNode(13);
		bst1.addNode(8);
		bst1.addNode(7);
		bst1.addNode(6);
		bst1.printAllTravesals();
		System.out.println();
		bst1.root = mirror(bst1.root);
		bst1.printAllTravesals();

	}

	private static TreeNode mirror(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);

		return root;

	}
}
