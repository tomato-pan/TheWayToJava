package algorithm.tree;

public class LC1448 {

    public static int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public static int dfs(TreeNode root, int maxValue) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val >= maxValue) {
            res = 1;
            maxValue = root.val;
        }
        int cntLeft = dfs(root.left, maxValue);
        int cntRight = dfs(root.right, maxValue);
        return res + cntLeft + cntRight;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right.right = new TreeNode(9);
        System.out.println(goodNodes(root));
    }
}
