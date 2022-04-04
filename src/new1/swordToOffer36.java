package new1;

public class swordToOffer36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    public Node tree(Node root){
        if (root==null) return null;
        inorder(root);
        head.left=pre;
        pre.right=head;
        return head;
    }
    Node head,pre;
    public void inorder(Node root){
        if (root==null) return;
        inorder(root.left);
        if (pre==null){
            head=root;
        }
        else {
            pre.right=root;
        }
        root.left=pre;
        pre=root;
        inorder(root.right);
    }
}
