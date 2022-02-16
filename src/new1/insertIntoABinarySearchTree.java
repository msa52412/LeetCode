package new1;

public class insertIntoABinarySearchTree {
    public TreeNode insertBst(TreeNode root,int val){
        if (root==null) return new TreeNode(val);
        if (val< root.val) {
            root.left=insertBst(root.left,val);
        }
        else {
            root.right=insertBst(root.right,val);
        }
        return root;
    }
}
