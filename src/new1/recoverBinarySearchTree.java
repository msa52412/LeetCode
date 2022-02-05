package new1;

public class recoverBinarySearchTree {
    private TreeNode x=null;
    private TreeNode y=null;
    private TreeNode pre=null;
    public void recover(TreeNode root){
            in(root);
            if (x!=null&&y!=null){
                int tmp=x.val;
                x.val=y.val;
                y.val=tmp;
            }
    }
    public void in(TreeNode root){
        if (root==null) return;
        in(root.left);
        if (pre != null) {
            if (pre.val > root.val) {
                y = root;
                if (x == null) x = pre;
            }
        }
        pre=root;
        in(root.right);
    }
}
