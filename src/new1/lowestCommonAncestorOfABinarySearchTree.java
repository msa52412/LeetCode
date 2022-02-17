package new1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lowestCommonAncestorOfABinarySearchTree {
    public TreeNode serachIn(TreeNode root,TreeNode p,TreeNode q){
        List<TreeNode> p1=getPath(root,p);
        List<TreeNode> q1=getPath(root,q);
        TreeNode res=null;
        for (int i=0;i<q1.size()&&i<p1.size();i++){
            if (p1.get(i)==q1.get(i)) res=q1.get(i);
            else break;
        }
        return res;

    }
    public List<TreeNode> getPath(TreeNode root, TreeNode v){
        List<TreeNode> res=new ArrayList<>();
        res.add(root);
        if (root.val==v.val) return res;
        while (root.val!=v.val){
            if (root.val>v.val) {
                res.add(root.left);
                root=root.left;
            }
            else {
                res.add(root.right);
                root=root.right;
            }
        }
        res.add(root);
        return res;
    }
    public TreeNode serachInEx(TreeNode root,TreeNode p,TreeNode q){
        TreeNode res=root;
        while (true){
            if(p.val<res.val&&q.val<res.val) res=res.left;
            else if(p.val>res.val&&q.val>res.val) res=res.right;
            else break;
        }
        return res;
    }
}
