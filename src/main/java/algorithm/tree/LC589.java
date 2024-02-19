package algorithm.tree;

import java.util.ArrayList;
import java.util.List;


public class LC589 {
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
    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfsPre(root,res);
        return res;
    }

    private void dfsPre(Node root, List<Integer> res) {
        if (root == null){
            return;
        }
        res.add(root.val);
        for (Node child : root.children) {
            dfsPre(child,res);
        }
    }


    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfsPost(root,res);
        return res;
    }

    private void dfsPost(Node root, List<Integer> res) {
        if (root == null){
            return;
        }
        for (Node child : root.children) {
            dfsPost(child,res);
        }
        res.add(root.val);
    }
}
