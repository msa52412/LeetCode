package new1;

public class swordToOffer68 {
    //bst
    public TreeNode lowest(TreeNode root,TreeNode p,TreeNode q){
        if (root==null) return null;
        if ((root.val<p.val&&root.val>q.val)||(root.val>p.val&&root.val<q.val)||root==p||root==q) return root;
        if (root.val>p.val) return lowest(root.left,p,q);
        else return lowest(root.right,p,q);
    }
    //tree
    public TreeNode low(TreeNode root,TreeNode p,TreeNode q){
        if (root==null) return null;

        if (root==p||root==q|| (search(root.left, p)&&search(root.right, q)||search(root.left, q)&&search(root.right, p))) return root;
        TreeNode left=low(root.left,p,q);
        TreeNode right=low(root.right,p,q);
        if (left!=null) return left;
        return right;
    }
    public boolean search(TreeNode root,TreeNode m){
        if (root==null||m==null) return false;
        if (root.val==m.val) return true;
        return search(root.left,m)||search(root.right,m);
    }
    //tree
    public TreeNode low1(TreeNode root,TreeNode p,TreeNode q){
        if (root==null) return null;
        if (root==p||root==q) return root;
        TreeNode left=low1(root.left,p,q);
        TreeNode right=low1(root.right,p,q);
        if (left!=null&&right!=null) return root;
        if (left!=null) return left;
        else return right;
    }
}
