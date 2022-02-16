package new1;

public class pathSumIii {
    public int path(TreeNode root,int sum){
        if (root==null) return 0;
        return count(root,sum)+path(root.right,sum- root.val)+path(root.left,sum- root.val);
    }
    public int count(TreeNode root,int sum){
        if (root==null)return 0;
        return (root.val==sum?1:0)+count(root.left,sum-root.val)+count(root.right,sum- root.val);
    }
}
