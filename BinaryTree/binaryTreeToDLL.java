package BinaryTree;

public class binaryTreeToDLL {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        root.right.right.right = new Node(22);
        Node ans = bToDLL(root);
        while(ans != null) {
            System.out.println(ans.data);
            ans = ans.right;
        }
    } 
	static Node head = null;
    static Node prev;
    public static Node bToDLL(Node root)
    {
        int f = 0;
	    inorder(root, f);
	    return head;
    }
    public static void inorder(Node root, int flag) {
        
        if (root == null) return;
        inorder(root.left, flag);
        if (flag == 0) {
           flag = 1;
           head = root;
           prev = root;
        }
        else {
            prev.right = root;
            root.left = prev;
            prev = root;
        }
        inorder(root.right, flag);   
    } 
}
