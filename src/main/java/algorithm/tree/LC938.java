package algorithm.tree;

public class LC938 {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int res = root.val;
        if (res > high) { // 右子树没有节点在范围内，只需递归左子树
            return rangeSumBST(root.left, low, high);
        }
        if (res < low) { // 左子树没有节点在范围内，只需递归右子树
            return rangeSumBST(root.right, low, high);
        }
        return res + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(15);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(7);
        TreeNode root5 = new TreeNode(18);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.right = root5;
        System.out.println(rangeSumBST(root, 7, 15));
    }
}
