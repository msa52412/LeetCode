package new1;

import java.util.LinkedList;
import java.util.Queue;

public class swordToOffer26 {
    public boolean is(TreeNode a,TreeNode b){
        if(a==null&&b==null) return true;
        else if(a!=null&&b!=null){
            if (a.val==b.val){
                if(b.left==null) return is(a.right,b.right);
                if (b.right==null) return is(a.left,b.left);
                return is(a.right,b.right)&&is(a.left,b.left);
            }
            else return false;
        }
        else if(a==null){
            return false;
        }
        else return true;
    }
    public boolean isin(TreeNode a,TreeNode b){
        if (b==null||a==null) return false;
        boolean flag=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(a);
        while (!queue.isEmpty()){
            TreeNode l=queue.poll();
            if (l.val==b.val){
                flag|=is(l,b);
            }
            if (l.left!=null){
                queue.add(l.left);
            }
            if (l.right!=null){
                queue.add(l.right);
            }
        }
        return flag;
    }

}
