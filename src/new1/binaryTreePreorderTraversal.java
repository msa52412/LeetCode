package new1;

import java.util.LinkedList;
import java.util.List;

public class binaryTreePreorderTraversal {
    public List<Integer> preorder(TreeNode root){
        LinkedList<Integer> res=new LinkedList<>();
        search(root,res);
        return res;
    }
    public void search(TreeNode root,LinkedList<Integer> res){
        if (root==null) return;
        res.add(root.val);
        search(root.left,res);
        search(root.right,res);
    }
}
