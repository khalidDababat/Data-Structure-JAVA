package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    // Root of the Binary Tree 
    Node<T> root;

    public BinaryTree() {
        root = null;

    }

    public BinaryTree(T data) {
        root = new Node<T>(data);

    }
    //1, 2, 3, 4, 5, 6, 6, 6, 6   Create Complete Binary Tree Using Array 

    public Node insertLevelOrder(int arr[], int i) { // Time Complixity O(n)

        Node root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new Node(arr[i]);
            // insert left child
            root.Left = insertLevelOrder(arr, 2 * i + 1);
            // insert Right Child 
            root.Right = insertLevelOrder(arr, 2 * i + 2);
        }

        return root;
    }

    public boolean IsCompleteBT(Node root) {

        // Base Case
        if (root == null) {
            return true;
        }

        Queue<Node> q = new LinkedList<>();

        // Create a flag variable which will be set true
        // when a non full node is seen
        boolean flag = false;

        // Do level order traversal using queue. 
        q.add(root);
        while (!q.isEmpty()) {
            Node temp_node = q.remove();
            /* Check if left child is present*/
            if (temp_node.Left != null) {
                // If we have seen a non full node, and we
                // see a node with non-empty left child,
                // then the given tree is not a complete
                // Binary Tree
                if (flag == true) {
                    return false;
                }

                // Enqueue Left Child
                q.add(temp_node.Left);
            } else {// If this a non-full node, set the flag as true
                flag = true;
                /* Check if right child is present*/
                if (temp_node.Right != null) {
                    // If we have seen a non full node, and we
                    // see a node with non-empty right child,
                    // then the given tree is not a complete
                    // Binary Tree
                    if (flag == true) {
                        return false;
                    }

                    // Enqueue Right Child
                    q.add(temp_node.Right);
                }// If this a non-full node, set the flag as true
                else {
                    flag = true;
                }
            }

        }
        // If we reach here, then the tree is complete
        // Binary Tree
        return true;
    }

    public Node buildTree(int[] nums) {  // O(n)   X X X  X X X X X
        if (nums == null || nums.length == 0) {
            return null;
        }
        Node root = new Node(nums[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nums.length) {
            Node curr = q.remove();
            if (i < nums.length) {
                curr.Left = new Node(nums[i++]);
                q.add(curr.Left);
            }
            if (i < nums.length) {
                curr.Right = new Node(nums[i++]);
                q.add(curr.Right);
            }
        }
        return root;
    }

    public void InOrder(Node root) {

        if (root != null) {
            InOrder(root.Left);
            System.out.print(root.data + " ");
            InOrder(root.Right);
        }
    }
 public void InOrder() { // left Root Right

        InOrder(root);
    }
    private static int count = 0;

    public static int countSubtreesWithSameValue(Node root) {
        countSubtrees(root);
        return count;
    }

    private static boolean countSubtrees(Node node) {
        if (node == null) {
            return true;
        }

        boolean left = countSubtrees(node.Left);
        boolean right = countSubtrees(node.Right);

        if (left && right) {
            if ((node.Left != null && node.Left.data == node.data)
                    || (node.Right != null && node.Right.data == node.data)
                    || (node.Left == null && node.Right == null)) {
                count++;
                return true;
            }
        }

        return false;
    }

  

    
    public static void main(String[] args) {

       

        BinaryTree t2 = new BinaryTree();  // Bulid Complete binary Tree Using Arrays
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        t2.root = t2.insertLevelOrder(arr, 0);
        t2.InOrder();



//********************************************************************************

//        BinaryTree t3 = new BinaryTree();  // Bulid Complete binary Tree Using Queue
//        int arr[] = { 1, 2, 3, 4,5 };
//        t3.root = t3.buildTree(arr);
//        t3.InOrder();







//        BinaryTree<Integer> a = new BinaryTree<>();
//        a.root = new Node(1);
//        a.root.Left = new Node(2);
//        a.root.Right = new Node(3);
//        a.root.Right.Right = new Node(7);
//        a.root.Left.Left = new Node(4);
//        a.root.Left.Left.Left = new Node(4);
//        a.root.Right.Left = new Node(5);
//        a.root.Right.Left.Right = new Node(5);
//






    }

}
