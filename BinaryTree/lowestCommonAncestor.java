package BinaryTree;

public class lowestCommonAncestor {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        Node ans = lca(root, 5, 2);
        System.out.println(ans.data);
    }   

    public static Node lca(Node root, int first, int second) {
        if (root == null) {
            return null;
        }
        if (root.data == first || root.data == second) {
            return root;
        }
        Node left = lca(root.left, first, second);
        Node right = lca(root.right, first, second);
        if (left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
}
