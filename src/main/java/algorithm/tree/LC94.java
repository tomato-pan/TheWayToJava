package algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class LC94 {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res  =  new ArrayList<>();
        inorder(res,root);
        return res;
    }

    private void  inorder(List<Integer> res, TreeNode root) {
        if (root==null)return;
        inorder(res, root.left);
        res.add(root.val);
        inorder(res, root.right);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList();
        travel(root, res);
        return res;
    }

    public static void travel(TreeNode root, List<Integer> res) {
        if (root == null) return;
        travel(root.left, res);
        res.add(root.val);
        travel(root.right, res);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t3.left = t6;
        t2.left = t4;
        t2.right = t5;
        System.out.println(inorderTraversal(t1));
    }

}
