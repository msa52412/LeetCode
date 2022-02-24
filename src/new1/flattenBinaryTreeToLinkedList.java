package new1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class flattenBinaryTreeToLinkedList {
    private Queue<TreeNode> res=new LinkedList<>();
    public void fla(TreeNode root){
        fir(root);
        TreeNode pre=root;
        TreeNode last=res.poll();

        while (!res.isEmpty()){
            last=res.poll();
            pre.right=last;
            pre.left=null;
            pre=pre.right;
        }
        return;

    }
    public void fir(TreeNode root){
        if (root==null) return;
        res.add(root);
        fir(root.left);
        fir(root.right);
    }
}
