package algorithm.tree;

import java.util.ArrayList;
import java.util.List;

public class LC872 {
    // DFS: 深度优先搜索
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // 判断两个二叉树的叶值序列是否相同
        String leftLeaf = dfs(root1, "");
        String rightLeaf = dfs(root2, "");
        return leftLeaf.equals(rightLeaf);
    }

    private String dfs(TreeNode root, String result) {
        // 判断当前节点是否为空
        if(root == null) return result;
        // 判断当前节点是否为叶子节点,若是则对其进行拼接
        if(root.left == null && root.right == null) {
            result += '-'; //
            result += result + root.val;
            return result;
        }
        // 递归遍历当前节点的左右孩子节点
        return dfs(root.left, result) + dfs(root.right, result);
    }

}
