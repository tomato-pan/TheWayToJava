package algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: tomato
 * @CreateTime: 2024-04-01  08:21
 * @Description: TODO
 * @Version: 1.0
 */
public class LC145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res  =  new ArrayList<>();
        postorder(res,root);
        return res;
    }

    private void postorder(List<Integer> res, TreeNode root) {
        if (root==null)return;
        postorder(res, root.left);
        postorder(res, root.right);
        res.add(root.val);
    }
}
