package src.main.practice.dsa.tree;

/*
 
 Input:            1                    1
                 /   \                /   \
                2      3             2      3
               /                    /
              4                    4


Output: Both trees are identical
 
 
 
 Input:            1                    1
                 /   \                /   \
                2     3              5      3
                      /             /
                     4             4

Output: Trees are not identical
 */
public class IdentialTree {
	public static void main(String[] args) {
		BinarySearchTree bst1 = new BinarySearchTree();
		BinarySearchTree bst2 = new BinarySearchTree();
		for (int i = 0; i < 10; i++) {
			int data = (int) (Math.random() * 100 - 30) + 30;
			bst1.addNode(data);
			bst2.addNode(data);
		}

		bst1.printAllTravesals();
		System.out.println();
		bst2.printAllTravesals();

		System.out.println("\n Trees are  identical :: " + findIdentical(bst1.root, bst2.root));
	}

	private static boolean findIdentical(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null)
			return true;
		if ((node1 == null && node2 != null) || (node1 != null && node2 == null) || node1.data != node2.data) {
			return false;
		} else {
			boolean leftNodes = findIdentical(node1.left, node2.left);
			boolean rightNodes = findIdentical(node1.right, node2.right);
			return leftNodes && rightNodes;
		}
	}

}
