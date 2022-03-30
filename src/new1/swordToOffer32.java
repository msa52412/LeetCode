package new1;

import java.util.*;

public class swordToOffer32 {
    public int[] level(TreeNode root){
        if (root==null) return new int[]{};
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> res=new ArrayList<Integer>();
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            res.add(node.val);
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
        }
        int[] ress=new int[res.size()];
        for (int i=0;i<res.size();i++){
            ress[i]=res.get(i);
        }
        return ress;
    }
    public List<List<Integer>> level1(TreeNode root){
        if (root==null) return new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int m=queue.size();
            List<Integer> eve=new ArrayList<>();
            for (int i=m;i>0;i--){
                TreeNode node=queue.poll();
                eve.add(node.val);
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
            res.add(eve);
        }
        return res;
    }
    public List<List<Integer>> level2(TreeNode root){
        if (root==null) return new ArrayList<>();
        Deque<TreeNode> queue=new LinkedList<>();
        Deque<TreeNode> nqueue=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        queue.add(root);
        while (true){
            int m=queue.size();
            List<Integer> eve=new ArrayList<>();
            for (int i=m;i>0;i--){
                TreeNode node=queue.poll();
                eve.add(node.val);
                if (node.left!=null) nqueue.add(node.left);
                if (node.right!=null) nqueue.add(node.right);
            }
            res.add(eve);
            if (nqueue.size()==0) break;
            int n=nqueue.size();
            List<Integer> eve1=new ArrayList<>();
            for (int i=n;i>0;i--){
                TreeNode node=nqueue.pollLast();
                eve1.add(node.val);
                if (node.right!=null) queue.addFirst(node.right);
                if (node.left!=null) queue.addFirst(node.left);
            }
            res.add(eve1);
            if (queue.size()==0) break;
        }
        return res;
    }
}
