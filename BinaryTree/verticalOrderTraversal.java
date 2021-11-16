package BinaryTree;
import java.util.*;

class Tuple {
    Node node;
    int row, col;
    public Tuple(Node _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}

public class verticalOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        System.out.println(verticalTraversal(root));
    }

    public static List<List<Integer>> verticalTraversal(Node root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()) {
            Tuple tuple = q.poll();
            Node node = tuple.node;
            int vertical = tuple.row;
            int level = tuple.col;
            if (!map.containsKey(vertical)) {
                map.put(vertical, new TreeMap<>());
            }
            if (!map.get(vertical).containsKey(level)) {
                map.get(vertical).put(level, new PriorityQueue<>());
            }
            map.get(vertical).get(level).offer(node.data);
            if (node.left != null) {
                q.offer(new Tuple(node.left, vertical-1, level+1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, vertical+1, level+1));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> x: map.values()) {
            List<Integer> subAns = new ArrayList<>();
            for (PriorityQueue<Integer> nodes: x.values()) {
                while(!nodes.isEmpty()) {
                    subAns.add(nodes.poll());
                }
            }
            ans.add(subAns);
        }
        return ans;
    }
}