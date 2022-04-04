package new1;

public class swordToOffer55 {
    //dep
    public int dep(TreeNode root){
        if (root==null) return 0;
        return Math.max(dep(root.left),dep(root.right))+1;
    }
    //avl
    public boolean is(TreeNode root){
        if (root==null) return true;
        if (dep(root.left)-dep(root.right)>1||dep(root.left)-dep(root.right)<-1) return false;
        return is(root.left)&&is(root.right);
    }
}
