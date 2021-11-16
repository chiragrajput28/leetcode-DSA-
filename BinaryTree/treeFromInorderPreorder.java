/**
 * Given 2 Arrays of Inorder and preorder traversal. Construct a tree and print the Postorder traversal. 

Example 1:

Input:
N = 4
inorder[] = {1 6 8 7}
preorder[] = {1 6 7 8}
Output: 8 7 6 1
Example 2:

Input:
N = 6
inorder[] = {3 1 4 0 5 2}
preorder[] = {0 1 3 4 2 5}
Output: 3 4 1 5 2 0
Explanation: The tree will look like
       0
    /     \
   1       2
 /   \    /
3    4   5
 */
package BinaryTree;
import java.util.*;

public class treeFromInorderPreorder {
    public static void main(String[] args) {
        int N = 6;
        int inorder[] = {3, 1, 4, 0, 5, 2};
        int preorder[] = {0,1,3, 4, 2, 5};
        Node root = buildTree(inorder, preorder, N);
        postOrder(root);
    }

    public static void postOrder(Node root) {
            
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(inorder[i],i);
        }
        Node root = buildTree(preorder,0,n-1,inorder,0,n-1,map);
        return root;
    }
    
    public static Node buildTree(int preorder[], int preStart, int preEnd, int inorder[], 
        int inStart, int inEnd, HashMap<Integer,Integer> map) {
            if (preStart > preEnd || inStart > inEnd) return null;
            Node root = new Node(preorder[preStart]);
            int inRoot = map.get(root.data);
            int nums = inRoot - inStart;
            root.left = buildTree(preorder, preStart+1, preStart+nums, inorder, inStart, inRoot-1, map);
            root.right = buildTree(preorder, preStart+nums+1, preEnd, inorder, inRoot+1, inEnd, map);
            return root;
            
        }   
}
