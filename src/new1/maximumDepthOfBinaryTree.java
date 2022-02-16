package new1;

public class maximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root){
        if (root==null) return 0;
        int r=maxDepth(root.right)+1;
        int l=maxDepth(root.left)+1;
        return Math.max(r,l);
    }
}
