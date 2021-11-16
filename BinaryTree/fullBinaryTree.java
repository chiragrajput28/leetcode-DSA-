package BinaryTree;

public class fullBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        //root.right.right.right = new Node(22);
        System.out.println(isFull(root));
    }
    public static boolean isFull(Node node) {
        if(node.right == null && node.left == null) {
            return true;
        }
        if(node.right != null && node.left != null) {
            return isFull(node.left) && isFull(node.right);
        }
        return false;
    }
}
