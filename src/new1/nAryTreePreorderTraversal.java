package new1;

import java.util.ArrayList;
import java.util.List;

public class nAryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<Integer> res=new ArrayList<>();
    public List<Integer> pro(Node root){
        if (root==null) return res;
        res.add(root.val);
        for(Node r:root.children){
            pro(r);
        }
        return res;
    }
    public List<Integer> post(Node root){
        if (root==null) return res;
        for (Node r:root.children){
            post(r);
        }
        res.add(root.val);
        return res;
    }
}
