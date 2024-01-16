package src.main.practice.dsa.tree;

public class BinarySearchTree {

	static TreeNode root = null;

	private static void postOrderTravesal(TreeNode node) {
		if (node != null) {

			postOrderTravesal(node.left);
			postOrderTravesal(node.right);
			System.out.print(node.data + " ");
		}

	}

	private static void preOrderTravesal(TreeNode node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preOrderTravesal(node.left);
			preOrderTravesal(node.right);

		}
	}

	private static void inOrderTravesal(TreeNode node) {
		if (node != null) {
			inOrderTravesal(node.left);
			System.out.print(node.data + " ");
			inOrderTravesal(node.right);
		}

	}

	public static void addNode(int data) {
		root = insertNode(root, data);
	}

	private static TreeNode insertNode(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}
		// There is no room for same data insert
		if (data < root.data) {
			root.left = insertNode(root.left, data);
		} else if (data > root.data) {
			root.right = insertNode(root.right, data);
		}
		return root;
	}

	public static void printAllTravesals() {
		System.out.println("In-order Traversal ");
		inOrderTravesal(root);

		System.out.println("\nPre-order Traversal ");
		preOrderTravesal(root);

		System.out.println("\nPost-order Traversal ");
		postOrderTravesal(root);
	}

}
