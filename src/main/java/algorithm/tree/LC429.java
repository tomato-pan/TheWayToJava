package algorithm.tree;

import java.util.ArrayList;
import java.util.List;


public class LC429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Node> cur = new ArrayList<>();
        cur.add(root);
        while (!cur.isEmpty()) {
            List<Node> nxt = new ArrayList<>();
            List<Integer> vals = new ArrayList<>(cur.size());
            for (Node node : cur) {
                vals.add(node.val);
                nxt.addAll(node.children);
            }
            cur = nxt;
            res.add(vals);
        }
        return res;
    }
}
