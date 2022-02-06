package new1;

public class deleteTreeNode {
    public TreeNode deletenode(TreeNode root,int key){
        if (root.val==key) {
            if (root.right==null&root.left==null) return null;
            if (root.left==null) return root.right;
            if (root.right==null) return root.left;
            else {
                TreeNode min=getMin(root.right);
                root.val=min.val;
                root.right=deletenode(root.right,min.val);
            }

        }
        else if (root.val>key){
            root.left=deletenode(root.left,key);
        }
        else if (root.val>key){
            root.right=deletenode(root.right,key);
        }
        return root;
    }
    public TreeNode getMin(TreeNode root){
        if (root.left==null) return root;
        else return getMin(root.left);
    }
}
