package thursday;

public class IntTreeNode {
	int data; 
	IntTreeNode right; 
	IntTreeNode left;
	
	// If user just gives data in the constructor  
	public IntTreeNode(int data) {
//		this.data = data; 
//		right = null;
//		left = null; 
		
		// more efficient way to write the this, right and left. 
		this(data,  null, null);
	}
	
	// If user gives data and address 
	public IntTreeNode(int data, IntTreeNode right, IntTreeNode left) {
		this.data = data;
		this.right = right;
		this.left = left; 
	}

}
