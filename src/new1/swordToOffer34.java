package new1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class swordToOffer34 {
    List<Integer> res;
    List<List<Integer>> ress;
    public List<List<Integer>> psthsum(TreeNode root,int tar){
        res=new ArrayList<>();
        ress=new ArrayList<>();
        sum(root,tar);
        return ress;
    }
    public void sum(TreeNode root,int tar){
        if (root==null) return;
        res.add(root.val);
        tar-=root.val;
        if (tar==0&&root.left==null&&root.right==null) {
            ress.add(new ArrayList<>(res));
        }
        sum(root.left,tar);
        sum(root.right,tar);
        res.remove(res.size()-1);
    }

}
