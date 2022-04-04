package new1;

import java.util.ArrayList;
import java.util.List;

public class swordToOffer54 {
    List<Integer> res;
    public int k(TreeNode root,int k){
        res=new ArrayList<>();
        in(root);
        return res.get(res.size()-k);
    }
    public void in(TreeNode root){
        if (root==null) return;
        in(root.left);
        res.add(root.val);
        in(root.right);
    }
    int k,r;
    public int k1(TreeNode root,int k){
        this.k=k;
        dfs(root);
        return r;
    }
    void dfs(TreeNode root){
        if (root==null) return;
        dfs(root.right);
        if (k==0) return;
        k--;
        if (k==0) r=root.val;
        dfs(root.left);
    }

}
