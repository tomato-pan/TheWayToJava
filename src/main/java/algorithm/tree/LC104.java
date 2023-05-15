package algorithm.tree;

public class LC104 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    private int ans=0;
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dps(root,0);
        return ans;
    }

    private void dps(TreeNode root, int num) {
        if (root==null){
            return;
        }
        if (ans<num+1){
            ans = num+1;
        }
        dps(root.left,num+1);
        dps(root.right,num+1);
    }

    public static void main(String[] args) {
        LC104 solution = new LC104();
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right.right = new TreeNode(9);
        System.out.println(solution.maxDepth(root));
        System.out.println(solution.maxDepth1(root));
    }

}
