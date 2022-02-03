package new1;

public class RooberTree {
    public int rob(TreeNode root) {
        int[] result=robber(root);
        return Math.max(result[0],result[1]);

    }
    public int[] robber(TreeNode root){
        if(root==null) return new int[2];

        int[] left=robber(root.left);
        int[] right=robber(root.right);
        int rob0=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        int rob1=left[0]+right[0]+root.val;
        return new int[]{rob0,rob1};
    }
}
