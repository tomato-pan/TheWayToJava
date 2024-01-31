package algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

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

    // DFS: 深度优先搜索
    public boolean leafSimilar2(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        dfs(root1,l1);
        dfs(root2,l2);
        return l1.equals(l2);
    }

    public void dfs(TreeNode root,List<Integer> arr){
        if (root==null){
            return;
        }
        if (root.right==null&&root.left==null){
            arr.add(root.val);
            return;
        }
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
    public static void main(String[] args) throws Exception {
        LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>(1000);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (true) {
                    queue.offer(new Object());
                    queue.remove();
                }
            }).start();
        }
        while (true) {
            System.out.println("begin scan, i still alive");
            queue.stream()
                    .filter(o -> o == null)
                    .findFirst()
                    .isPresent();
            Thread.sleep(100);
            System.out.println("finish scan, i still alive");
        }
    }
}
