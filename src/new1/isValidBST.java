package new1;

public class isValidBST {
    public boolean isvalidbst(TreeNode root){
        return isbst(root,null,null);
    }
    public boolean isbst(TreeNode root,TreeNode min,TreeNode max){
        if (root==null) return true;
        if (min!=null&&root.val<min.val) return false;
        if (max!=null&&root.val>max.val) return false;
        return isbst(root.left,min,root)&&isbst(root.right,root,max);
    }
}
