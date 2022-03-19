package new1;

public class constructStringFromBinaryTree {
    public String tree2str(TreeNode root){
        if (root==null) return "";
        else if (root.right!=null&&root.left!=null) {
            return root.val + "(" + tree2str(root.left) +")"+"("+ tree2str(root.right) + ")";
        }
        else if (root.right==null&&root.left!=null){
            return root.val + "(" + tree2str(root.left) +")";
        }
        else if (root.right!=null&&root.left==null){
            return root.val +"()"+ "(" + tree2str(root.right) +")";
        }
        else {
            return String.valueOf(root.val);
        }

    }

}
