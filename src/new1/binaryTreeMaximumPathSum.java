package new1;

public class binaryTreeMaximumPathSum {
    int max=Integer.MIN_VALUE;
    public int maxPathTree(TreeNode root){
        getpath(root);
        return max;

    }
    public int getpath(TreeNode root){
        if (root==null) return 0;
        int left=Math.max(getpath(root.left),0);
        int right=Math.max(getpath(root.right),0);
        int price=root.val+left+right;
        max=Math.max(max,price);
        return root.val+Math.max(left,right);
    }

}
