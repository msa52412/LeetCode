package new1;

public class searchInABinarySearchTree {
    public TreeNode search(TreeNode root,int val){
        while (root!=null&&root.val!=val){
            if (root.val>val) root=root.left;
            else root=root.right;
        }
        return root;
    }
}
