package algorithm.tree;

import java.util.*;

public class LC107 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);
        while (!cur.isEmpty()){
            List<TreeNode> nxt  = new ArrayList<>();
            List<Integer> vals = new ArrayList<>(cur.size());
            for (TreeNode treeNode : cur) {
                vals.add(treeNode.val);
                if (treeNode.left!=null){
                    nxt.add(treeNode.left);
                }
                if (treeNode.right!=null){
                    nxt.add(treeNode.right);
                }
            }
            cur = nxt;
            res.add(vals);
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        System.out.println(levelOrderBottom(treeNode));

    }

}
