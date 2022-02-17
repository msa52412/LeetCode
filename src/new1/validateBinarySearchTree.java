package new1;

public class validateBinarySearchTree {
    public boolean isValid(TreeNode root){
        if (root==null) return false;
        return isv(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean isv(TreeNode root,long max,long min){
        if (root==null) return true;
        if (root.val>=max||root.val<=min) return false;
        return isv(root.right,max,root.val)&&isv(root.left,root.val,min);
    }
}
