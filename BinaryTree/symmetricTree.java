package BinaryTree;

public class symmetricTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(7);
        root.right.right = new Node(2);
        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(Node root)
    {
        return findSymmetric(root, root);
    }
    public static boolean findSymmetric(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data) && 
        findSymmetric(root1.left,root2.right) && 
        findSymmetric(root1.right,root2.left);
    }
}
