
public class InvertBinaryTree {

	// Definition for a binary tree node.
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) {
			this.val = val; 
		}
		      
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	// Given the root of a binary tree, invert the tree, and return its root.
	public TreeNode invertTree(TreeNode root) {
		
		if(root == null)
			return null;
		
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
} 
