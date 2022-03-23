package new1;

public class swordToOffer28 {
    public boolean is(TreeNode root){
        if(root==null) return true;
        return isi(root.left,root.right);
    }
    public boolean isi(TreeNode root,TreeNode r){
        if (root==null){
            if (r==null) return true;
            else return false;
        }
        else {
            if (r==null) return false;
            else {
               return isi(root.left,r.right)&&isi(root.right,r.left)&&root.val==r.val;
            }
        }
    }
}
