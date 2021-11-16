package BinaryTree;
import java.util.*;
public class levelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(7);
        root.right.right = new Node(2);
        System.out.println(traversal(root));;
    }
    public static List<List<Integer>> traversal (Node root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue <Node> q = new LinkedList<>();
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int num = q.size();
            List<Integer> subAns = new LinkedList<>();
            for (int i = 0; i < num; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                subAns.add(q.poll().data);
            }
            ans.add(subAns);
        }
        return ans;
    }
}
