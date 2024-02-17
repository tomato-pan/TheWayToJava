package algorithm.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);
        boolean left = true;
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
            if (!left){
                Collections.reverse(vals);
            }
            res.add(vals);
            left = !left;
        }
        return res;
    }
}
