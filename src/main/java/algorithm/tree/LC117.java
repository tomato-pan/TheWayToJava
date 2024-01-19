package algorithm.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC117 {
    public Node connect(Node root) {
        Node ans = root;
        if (root == null) return ans;
        Deque<Node> d = new ArrayDeque<>();
        d.addLast(root);
        while (!d.isEmpty()) {
            int sz = d.size();
            while (sz-- > 0) {
                Node a = d.pollFirst();
                if (sz != 0) a.next = d.peekFirst();
                if (a.left != null) d.addLast(a.left);
                if (a.right != null) d.addLast(a.right);
            }
        }
        return ans;

    }
}
