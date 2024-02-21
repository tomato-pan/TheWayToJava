package algorithm.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if (n == 0) { // 空节点
            return null;
        }
        int leftSize = indexOf(inorder, preorder[0]); // 左子树的大小
        int[] pre1 = Arrays.copyOfRange(preorder, 1, 1 + leftSize);
        int[] pre2 = Arrays.copyOfRange(preorder, 1 + leftSize, n);
        int[] in1 = Arrays.copyOfRange(inorder, 0, leftSize);
        int[] in2 = Arrays.copyOfRange(inorder, 1 + leftSize, n);
        TreeNode left = buildTree(pre1, in1);
        TreeNode right = buildTree(pre2, in2);
        return new TreeNode(preorder[0], left, right);
    }

    // 返回 x 在 a 中的下标，保证 x 一定在 a 中
    private int indexOf(int[] a, int x) {
        for (int i = 0; ; i++) {
            if (a[i] == x) {
                return i;
            }
        }
    }

    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if (len == 0) { // 空节点
            return null;
        }
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < len; i++) {
            index.put(inorder[i], i);
        }
        return dfs(preorder, 0, len, 0, index); // 左闭右开区间
    }

    private TreeNode dfs(int[] preorder, int preL, int preR, int inL, Map<Integer, Integer> index) {
        if (preL == preR) { // 空节点
            return null;
        }
        int leftSize = index.get(preorder[preL]) - inL; // 左子树的大小
        TreeNode left = dfs(preorder, preL + 1, preL + 1 + leftSize, inL, index);
        TreeNode right = dfs(preorder, preL + 1 + leftSize, preR, inL + 1 + leftSize, index);
        return new TreeNode(preorder[preL], left, right);
    }
}
