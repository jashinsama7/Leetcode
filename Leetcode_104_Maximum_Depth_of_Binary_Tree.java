class Solution {
    
    public int depth(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int left  = depth(root.left);
        int right = depth(root.right);
        
        return (Math.max(left,right) + 1);
    }
    
    
    public int maxDepth(TreeNode root) {
        return depth(root);
    }
}
