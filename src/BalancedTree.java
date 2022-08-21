
public class BalancedTree {

	// Definition for a binary tree node.
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.val = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	    }
	}
	
	public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        
        return height(root) != -1;
    }
    
    public int height(TreeNode root){
        
        if(root == null)
            return 0;
        
        int l = height(root.left), r = height(root.right);
        
        if(l == -1)
            return -1;
        
        if(r == -1)
            return -1;
        
        if(l - r < -1 || l - r > 1)
            return -1;
        
        return Math.max(l,r) + 1;
    }
}
