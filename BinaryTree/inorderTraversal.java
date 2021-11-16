package BinaryTree;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int key) {
        data = key;
    }
}

public class inorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        ArrayList<Integer> res = new ArrayList<>();
        res = inOrder(root);
        for(int x : res){
            System.out.println(x);
        }
    }
    static ArrayList<Integer> ans = new ArrayList<>();
    public static ArrayList<Integer> inOrder(Node root) {
        
        if(root != null) {
            inOrder(root.left);
            ans.add(root.data);
            inOrder(root.right);
        }
        return ans;
    }
}
