package new1;

import java.util.HashMap;

public class zhongJianErChaShuLcof {
    int[] pre;
    HashMap<Integer,Integer> dir=new HashMap<>();
    public TreeNode build(int[] pre,int[] in){
        this.pre=pre;
        for (int i=0;i<in.length;i++){
                dir.put(in[i],i);
        }
        return rebuild(0,0,in.length-1);

    }
    public TreeNode rebuild(int root,int left,int right){
        if (left>right) return null;
        TreeNode node=new TreeNode(pre[root]);
        int i=dir.get(pre[root]);
        node.left=rebuild(root+1,left,i-1);
        node.right=rebuild(root+i-left+1,i+1,right);
        return node;
    }

}
