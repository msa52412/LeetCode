package new1;

public class isInBST {
    boolean isinbst(TreeNode root,int value){
        if (root==null) return false;
        if (root.val==value) return true;
        if (root.val<value) return isinbst(root.right,value);
        if (root.val>value) return isinbst(root.left,value);
        return true;
    }
}
