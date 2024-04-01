package algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: tomato
 * @CreateTime: 2024-04-01  08:16
 * @Description: TODO
 * @Version: 1.0
 */
public class LC144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res  =  new ArrayList<>();
        preorder(res,root);
        return res;
    }

    private void preorder(List<Integer> res, TreeNode root) {
        if (root==null){
            return;
        }
        res.add(root.val);
        preorder(res,root.left);
        preorder(res,root.right);
    }


}
