package new1;

public class swordToOffer27 {
    public TreeNode mirror(TreeNode root){
        if (root==null) return null;
        TreeNode l=mirror(root.right);
        TreeNode r=mirror(root.left);
        root.left=l;
        root.right=r;
        return root;
    }
}
