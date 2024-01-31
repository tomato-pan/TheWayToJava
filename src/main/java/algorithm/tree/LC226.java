package algorithm.tree;

public class LC226 {
    public static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private static void invert(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right.right = new TreeNode(9);
        binTree1 a1 = new binTree1();
        System.out.println(a1.preOrderTravel(invertTree(root)));
    }
}
