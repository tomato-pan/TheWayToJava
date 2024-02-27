package algorithm.tree;

public class LC100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // 都为空的话，显然相同
        if (p == null && q == null) return true;
        // 一个为空，一个非空，显然不同
        if (p == null || q == null) return false;
        // 两个都非空，但 val 不一样也不行
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(3);
        p.right = new TreeNode(2);
        p.left = new TreeNode(1);
        p.right.right = new TreeNode(9);
        TreeNode q = new TreeNode(3);
        q.right = new TreeNode(2);
        q.left = new TreeNode(1);
        q.right.right = new TreeNode(9);
        System.out.println(isSameTree(p, q));
    }
}
