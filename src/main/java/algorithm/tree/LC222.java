package algorithm.tree;
// 完全二叉树计算节点---2^h-1
public class LC222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int countNodes1(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        System.out.println("left = " + left + ", right = " + right);
        //case1 1(根节点) + (1 << ld)-1(左完全左子树节点数) + 右子树节点数量
        if (left==right){
            return (1<<left)+countNodes1(root.right);
        }
        //case2 1(根节点) + (1 << ld)-1(左完全左子树节点数) + 右子树节点数量
        else {
            return (1<<right)+countNodes1(root.left);
        }
    }
    private int getDepth(TreeNode r) {
        int depth = 0;
        while(r != null) {
            depth++;
            r = r.left;
        }
        return depth;
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
        LC222 lc = new LC222();
        System.out.println(lc.countNodes(t1));
        System.out.println(lc.countNodes1(t1));
    }
}
