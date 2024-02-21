package algorithm.tree;

public class LC1038 {
    int tot = 0;
    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }
    void dfs(TreeNode root) {
        if (root == null) return ;
        dfs(root.right);
        tot += root.val;
        root.val = tot;
        dfs(root.left);
    }

}
