package algorithm.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        if (n == 0) { // 空节点
            return null;
        }
        int idx = indexOf(inorder, postorder[n - 1]); // 左子树的大小
        int[] post1 = Arrays.copyOfRange(postorder, 0, n-1);
        int[] post2 = Arrays.copyOfRange(postorder, 1 + idx, n-1);
        int[] in1 = Arrays.copyOfRange(inorder, 0, idx);
        int[] in2 = Arrays.copyOfRange(inorder, 1 + idx, n);
        TreeNode left = buildTree(in1, post1);
        TreeNode right = buildTree(in2, post2);
        return new TreeNode(postorder[n-1], left, right);
    }

    // 返回 x 在 a 中的下标，保证 x 一定在 a 中
    private int indexOf(int[] a, int x) {
        for (int i = 0;  ; i++) {
            if (a[i] == x) {
                return i;
            }
        }
    }

    public TreeNode buildTree2(int[] inorder, int[] postorder) {
        int n = inorder.length;
        Map<Integer, Integer> index = new HashMap<>(n); // 预分配空间
        for (int i = 0; i < n; i++) {
            index.put(inorder[i], i);
        }
        return dfs(0, postorder, 0, n, index); // 左闭右开区间
    }

    private TreeNode dfs(int inL, int[] postorder, int postL, int postR, Map<Integer, Integer> index) {
        if (postL == postR) { // 空节点
            return null;
        }
        int leftSize = index.get(postorder[postR - 1]) - inL; // 左子树的大小
        TreeNode left = dfs(inL, postorder, postL, postL + leftSize, index);
        TreeNode right = dfs(inL + leftSize + 1, postorder, postL + leftSize, postR - 1, index);
        return new TreeNode(postorder[postR - 1], left, right);
    }

}
