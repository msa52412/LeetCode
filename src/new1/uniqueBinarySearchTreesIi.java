package new1;

import new1.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class uniqueBinarySearchTreesIi {
    public List<TreeNode> gen(int n){
        if (n==0) return new LinkedList<TreeNode>();
        return get(1,n);
    }
    public List<TreeNode> get(int s,int e){
        List<TreeNode> all=new LinkedList<TreeNode>();
        if (s>e) {
            all.add(null);
            return all;
        }
        for (int i=s;i<=e;i++){
            List<TreeNode> left=get(s,i-1);
            List<TreeNode> right=get(i+1,e);
            for (TreeNode l:left){
                for (TreeNode r:right){
                    TreeNode curr=new TreeNode(i);
                    curr.left=l;
                    curr.right=r;
                    all.add(curr);
                }
            }
        }
        return all;
    }
}
