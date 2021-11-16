package BinaryTree;

// class Node {
//     int data;
//     Node left, right;
//     public Node(int key){
//         data = key;
//     }
// }

public class heightOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        root.right.right.right = new Node(22);
        System.out.println(heigth(root));
    }
    public static int heigth (Node root) {
        if (root == null) return 0;
        else return Math.max(heigth(root.left), heigth(root.right)) + 1;
    }
}
