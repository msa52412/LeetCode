package new1;

public class maximumBinaryTree {
    public TreeNode con(int[] nums){
        return cons(nums,0,nums.length);
    }
    public TreeNode cons(int[] nums,int l, int r){
        if (l==r) return null;
        int maxi=max(nums,l,r);
        TreeNode root=new TreeNode(nums[maxi]);
        root.left=cons(nums,l,maxi);
        root.right=cons(nums,maxi+1,r);
        return root;
    }
    public int max(int[] nums,int l,int r){
        int maxi=l;
        for (int i=l;i<r;i++){
            if (nums[maxi]<nums[i]) maxi=i;
        }
        return maxi;
    }
}
