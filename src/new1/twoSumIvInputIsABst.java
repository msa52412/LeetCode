package new1;

import java.util.*;

public class twoSumIvInputIsABst {
    public boolean find(TreeNode root,int k){
       Set<Integer> set=new HashSet<>();
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(root);
       while (!queue.isEmpty()){
           TreeNode eve=queue.poll();
           if (eve.left!=null) queue.add(eve.left);
           if (eve.right!=null) queue.add(eve.right);
           if (set.contains(k-eve.val)) return true;
           set.add(eve.val);

       }
       return false;
    }

}
