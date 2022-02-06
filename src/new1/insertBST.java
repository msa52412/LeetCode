package new1;

public class insertBST {
    TreeNode insert(TreeNode root,int val){
        if (root==null) return new TreeNode(val);
        if (root.val<val) root.right=insert(root.right,val);
        if (root.val>val) root.left=insert(root.left,val);
        return root;
    }
}
