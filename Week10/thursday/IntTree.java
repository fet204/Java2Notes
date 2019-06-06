package thursday;

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
	
	// Inclass Equals method 
	public boolean equal(IntTree other) {
		return equal(overallRoot, other.overallRoot);
	}
	
	private boolean equal(IntTreeNode root1, IntTreeNode root2) {
		if (root1 == null|| root2 == null) {
			return root1 == null && root2 == null; 
		}
		
		else {
			return root1.data == root2.data && equal(root1.left, root2.left) && equal(root1.right, root2.right);
		}
		
	}
	
	
	// Inclass countBelow assignment
	public int count(int min) {
		if (min <= 0) {
			throw new IllegalArgumentException(); 
		}
		
		else {
			return count(overallRoot, min);
		}
		
	}
	
	private int count(IntTreeNode root, int min) {
		int count = 0;
		if (root != null) {
			if (min <= 1) {
				count ++;
			}
			count += count(root.left, min  -1) + count(root.right, min - 1);
		}
		return count;
	}
	
	
	
	
}

