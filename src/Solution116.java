import java.util.HashMap;
import java.util.Map;

public class Solution116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Map<Integer, Node> map = new HashMap<>();
        bfs(root, map, 1);
        return root;
    }

    //          0
    //       1         2
    //     3   4     5     6
    //    7 8 9 10 11 12 13 14

    public void bfs(Node root, Map<Integer, Node> lastMap, int level) {
        if (root == null) {
            return;
        }
        if (lastMap.get(level) == null) {
            lastMap.put(level, root);
        } else {
            lastMap.get(level).next = root;
            lastMap.put(level, root);
        }
        bfs(root.left, lastMap, level+1);
        bfs(root.right, lastMap, level+1);
    }



    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
