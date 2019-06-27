package binarySearchTrees;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		if (subtreeRoot == null) {
			return subtreeRoot;
		}
		if (value < subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
		}
		else if(value > subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		}
		else {
			//case 0 and 1: node to delete has 0 or 1 child.
			if (subtreeRoot.getLeftChild() == null) {
				return subtreeRoot.getRightChild();
			}
			else if (subtreeRoot.getRightChild() == null) {
				return subtreeRoot.getLeftChild();
			}
			//case 2: node to delete has 2 children.
			else {
				//replace the value in the subtreeRoot node with the smallest value from the right subtree
				subtreeRoot.setData(subtreeRoot.getRightChild().min());
				//delete the node that has the smallest value in the right subtree
				subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
			}
			
		}
		return subtreeRoot;
	}
	
	public TreeNode get(int value) {
		if (root != null) {
			return root.get(value);
		}
		else {
			return null;
		}
	}
	
	public int min() {
		if (root == null) {
			return -1;
		}
		else {
			return root.min();
		}
	}
	
	public int max() {
		if (root == null) {
			return -1;
		}
		else {
			return root.max();
		}
	}
	
	public void traverseInOrder() {
		
		if (root != null) {
			root.traverseInOrder();
		}
		
	}
	
	public void traversePreOrder() {
		
		if (root != null) {
			root.traversePreOrder();
		}
		
	}
	
	public void traversePostOrder() {
		
		if (root != null) {
			root.traversePostOrder();
		}
		
	}
	
	
	
}
