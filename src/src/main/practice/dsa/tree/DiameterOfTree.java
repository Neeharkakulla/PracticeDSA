package src.main.practice.dsa.tree;

public class DiameterOfTree {
	static int diameter = 0;

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		for (int i = 0; i < 10; i++) {
			bst.addNode((int) (Math.random() * 100 - 30) + 30);
		}

		bst.printAllTravesals();

		System.out.println("\n Diameter of BST :: " + findDiameter(bst.root));
	}

	private static int findDiameter(TreeNode root) {
		calculateDiameter(root);
		return diameter;
	}

	private static int calculateDiameter(TreeNode root) {
		if (root == null)
			return 0;

		int leftHeight = calculateDiameter(root.left);
		int rightHeight = calculateDiameter(root.right);

		diameter = Math.max(diameter, leftHeight + rightHeight);

		return 1 + Math.max(leftHeight, rightHeight);

	}
}
