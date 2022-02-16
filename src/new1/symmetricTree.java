package new1;

public class symmetricTree {
    public boolean isLike(TreeNode root){
        return islike(root.left,root.right);
    }
    public boolean islike(TreeNode root,TreeNode lr){
        if (root==null&&lr==null) return true;
        else if (root!=null&&lr!=null) return root.val==lr.val&&islike(root.left,lr.right)&&islike(root.right, lr.left);
        else return false;
    }
}
