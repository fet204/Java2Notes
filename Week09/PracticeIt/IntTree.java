package PracticeIt;

public class IntTree {
	private IntTreeNode overallRoot;
	
	public IntTree() {
		overallRoot = null;
	}
	
	// public add method that user can use 
	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}
	
	private IntTreeNode add(IntTreeNode root, int value) {
		if(root == null) {
			root = new IntTreeNode(value);
		}
		else if(root.data < value) {
			root.right = add(root.right, value);
		}
		else if (root.data > value) {
			root.left = add(root.left, value);
		}
		return root;
		
		
	}

}
