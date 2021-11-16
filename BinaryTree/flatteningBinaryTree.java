package BinaryTree;

public class flatteningBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        root.right.right.right = new Node(22);
        flatten(root);
        while (root != null) {
            System.out.println(root.data);
            root = root.right;
        }
    }
    public static void flatten(Node root) {
        Node curr = root;
        while(curr != null) {
            if (curr.left != null) {
                Node next = curr.left;
                while(next.right != null) {
                    next = next.right;
                }
                next.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
