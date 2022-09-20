package algorithm.tree;

import tree.TreeNode;

public class LC116 {

    public Node connect(Node root) {
        if (root==null){
            return null;
        }
        connectTwoNode(root.left,root.right);
        return root;
    }
    void connectTwoNode(Node node1, Node node2){
        if (node1 == null || node2 ==null){
            return;
        }
        node1.next = node2;
        connectTwoNode(node1.left,node1.right);
        connectTwoNode(node1.right,node2.left);
        connectTwoNode(node2.left,node2.right);
    }
    void flatten(TreeNode root) {
        // base case
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

        /**** 后序遍历位置 ****/
        // 1、左右子树已经被拉平成一条链表
        TreeNode left = root.left;
        TreeNode right = root.right;

        // 2、将左子树作为右子树
        root.left = null;
        root.right = left;

        // 3、将原先的右子树接到当前右子树的末端
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
