package new1;

public class lowestCommonAncestorOfABinaryTree {
    public TreeNode low(TreeNode root,TreeNode p,TreeNode q){
        TreeNode r1=root,r2=root,res=null;
        boolean sr1,sr2,sl1,sl2;
        while (r1==r2){
            res=r1;
            sr1=search(r1.right,p);
            sr2=search(r1.left,p);
            sl1=search(r2.right,q);
            sl2=search(r2.left,q);
            if (sr1) r1=r1.right;
            if (sr2) r1=r1.left;
            if (sl1) r2=r2.right;
            if (sl2) r2=r2.left;
        }
        return res;

    }
    public boolean search(TreeNode root,TreeNode s){
        if (root==s) return true;
        if (root==null) return false;
        return search(root.left,s)||search(root.right,s);
    }
    public TreeNode lowst(TreeNode root,TreeNode p,TreeNode q){
        if (root==p||root==q) return root;
        if (root!=null){
            TreeNode l=lowst(root.left,p,q);
            TreeNode r=lowst(root.right,p,q);
            if (l!=null&&r!=null) return root;
            else if (l==null) return r;
            else return l;
        }
        return null;
    }
}
