package BinaryTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Stack;
import mydatastructre.MylinkedList;

public class BST<T extends Comparable<T>> {

    public Node root;
    public int size = 0;
    public Comparator<T> c;
    ArrayList a = new ArrayList();

    public BST() {
        this.c = (e1, e2) -> e1.compareTo(e2);

    }

    public BST(Comparator<T> c) {
        this.c = c;

    }

    public BST(T objects[]) {
        this.c = (e1, e2) -> ((Comparable<T>) e1).compareTo(e2);
        for (int i = 0; i < objects.length; i++) {
            a.add(objects[i]);
        }
    }

    public void insert(T data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;

        } else {
            Node<T> current = root;
            Node<T> parent = null;
            while (true) {
                parent = current;

                if (data.compareTo(current.getData()) < 0) {
                    current = current.Left;

                    if (current == null) {
                        parent.Left = newNode;
                        break;
                    }
                } else {
                    current = current.Right;
                    if (current == null) {
                        parent.Right = newNode;
                        break;
                    }
                }

            }

        }
        size++;
    }

    public Node<T> deleteNode(Node<T> root, T value) {

        if (root == null) {
           
            return root;
        }

        if (value.compareTo(root.data) < 0) {
            // The value to be deleted is in the left subtree
            root.Left = deleteNode(root.Left, value);
            
        } else if (value.compareTo(root.data) > 0) {
            // The value to be deleted is in the right subtree
            root.Right = deleteNode(root.Right, value);
        } else {
            // Node With Onlay One Child Or No Child 
            if (root.Left == null) {
                return root.Right;
            }else if (root .Right ==null){
             return root.Left; 
            }
           //Node with two children successor (smallest  in the right subtree) 
         
           root.data =minValue(root.Right); 
           root.Right =deleteNode(root.Right, root.data); 
        
        }
       
        return root ; 

    }
    public void  delete(T value ){
      deleteNode(root, value);
      size--; 
     }

    public T minValue(Node<T> root) {
        T minValue = root.data;
        while (root.Left != null) {
            minValue = root.Left.data;

            root = root.Left;

        }
        return minValue;

    }

    public int getSize() {
        return size;

    }

    private void PreOrder(Node<T> n) { // Root lift Right 
        if (n == null) {
            return;
        }
        System.out.print(n.getData() + " ");
        PreOrder(n.Left);
        PreOrder(n.Right);

    }

    private void InOrder(Node<T> root) { // lift root Right
        if (root == null) {
            return;
        }
        InOrder(root.Left);
        System.out.print(root.getData() + " ");
        InOrder(root.Right);

    }

    private void PostOrder(Node<T> root) { // lift Right Root 
        if (root == null) {
            return;
        }
        PostOrder(root.Left);
        PostOrder(root.Right);
        System.out.print(root.getData() + " ");

    }

    public void PreOrder() { // Root lift Right 

        PreOrder(root);
    }

    public void InOrder() { // left Root Right

        InOrder(root);
    }

    public void PostOrder() { // left right root 

        PostOrder(root);
    }

    private int Hight(Node r) {
        if (r == null) {
            return -1;
        } else {
            return 1 + Math.max(Hight(r.Right), Hight(r.Left));

        }

    }

    public int Hight() {
        return Hight(root);

    }

    private boolean IsBalnced(Node r) {
        if (r == null) {
            return false;
        }
        int HL = Hight(r.Left);
        int HR = Hight(r.Right);
        if (HL - HR > 1 || HR - HL > 1) { // canot equal 0 1 -1 Not Balnced  
            return false;
        }
        return true;

    }

    public boolean IsBalnced() {
        return IsBalnced(root);

    }

    public boolean IsParent(Node r) {
        if (r == null) {
            return false;

        }
        if (r.Right != null || r.Left != null) {
            return true;
        } else {

            return false;
        }

    }

    public boolean IsLeaf(Node r) {
        if (r == null) {
            return false;

        }
        if (r.Right == null && r.Left == null) {
            return true;

        } else {
            return false;
        }

    }

    public void PrintLeaf(Node r) {
        if (r == null) {
            return;
        }
        if (IsLeaf(r)) {
            System.out.println(r.getData() + " ");
        }
        PrintLeaf(r.Right);
        PrintLeaf(r.Left);
    }

    public void PrintLeaf() {
        PrintLeaf(root);
    }

    private Node MinmumElment(Node r) {
        if (r.Left == null) {
            return r;
        }

        return MinmumElment(r.Left);
    }

    public Integer MinmumElment() {

        return (Integer) (MinmumElment(root).getData());
    }

    private Node MaximumElment(Node r) {
        if (r.Right == null) {
            return r;
        }

        return MaximumElment(r.Right);
    }

    public boolean Search(int data) {
        Node curr = root;
        while (curr != null) {

            if (curr.getData().equals(data)) {
                return true;
            } else if ((int) curr.data > data) {
                curr = curr.Left;
            } else {
                curr = curr.Right;

            }

        }
        return false;
    }

    public int CountOfNode(Node root) {
        if (root == null) {
            return 0;
        } else {

            return 1 + CountOfNode(root.Left) + CountOfNode(root.Right);
        }

    }

    public int CountOfNode() {
        return CountOfNode(root);

    }

    public boolean IsEmpty() {

        return root == null;

    }

    public void Clear() {
        root = null;
        size = 0;

    }

    public void Traversal() {
        System.out.println("\nIn-Order   :");
        InOrder();
        System.out.println("\nPost-Order :");
        PostOrder();
        System.out.println("\nPreeOrder  :");
        PreOrder();
        System.out.println("\nPrent-Level:");
        PrintLevel();

    }

    private void PrintLevel(Node root, int h) {
        if (root == null) { // base Case 1 
            return;
        }
        if (h == -1) {   //      base Case 2 
            System.out.print(" " + root.getData());
        } else {           // Recurseve Case                
            PrintLevel(root.Right, h - 1);
            PrintLevel(root.Left, h - 1);

        }

    }

    public void PrintLevel() {
        int hight = Hight(); // 3 
        int c = -1;
        while (c <= hight) {
            System.out.println("");
            PrintLevel(root, c);
            ++c;

        }

    }

    public void LevelOrder(int Level) {
        int h = Hight();
        for (int i = Level; i <= h; i++) {
            LevelOrder(root, i);
            System.out.println("");
        }

    }

    private void LevelOrder(Node root, int Level) {
        if (root == null) {
            return;
        }
        if (Level == 0) {
            System.out.print(" " + root.data);
        } else {
            LevelOrder(root.Right, Level - 1);
            LevelOrder(root.Left, Level - 1);
        }
    }

    private void LevelReveceOrder(Node root) {

        Stack<Node> s = new Stack();
        MylinkedList<Node> q = new MylinkedList<>(); // Queue By Linked List 
        Node temp;
        q.add(root);
        while (!q.isempty()) {
            temp = q.poll();
            s.push(temp);
            if (temp.Left != null) {
                q.add(temp.Left);
            }
            if (temp.Right != null) {
                q.add(temp.Right);
            }

        }
        while (!s.isEmpty()) {
            System.out.println(s.pop().getData() + " ");

        }

    }

    public void LevelReveceOrder() {
        LevelReveceOrder(root);
    }

    public int path(T e) {
        ArrayList<Node> list = new ArrayList<>();
        Node current = root; // Start from the root

        while (current != null) {
            list.add(current); // Add the node to the list
            if (e.compareTo((T) current.data) < 0) {
                current = current.Left;
            } else if (e.compareTo((T) current.data) > 0) {
                current = current.Right;
            } else {
                break;
            }
        }

        return list.size(); // Return an array list of nodes
    }

   

    public int maxLeafNodesSum() {

        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        int Maxsum = 0;
        q.add(root);
        while (!q.isEmpty()) {

            for (int i = 0; i < q.size(); i++) {
                Node<T> curr = q.poll();
                if (curr.Left == null && curr.Right == null) {
                    Maxsum += (Integer) curr.data;
                }
                if (curr.Left != null) {
                    q.add(curr.Left);

                }
                if (curr.Right != null) {
                    q.add(curr.Right);

                }

            }
        }
        return Maxsum;
    }

    public static void main(String[] args) {

        BST b = new BST();
        b.insert(50);
        b.insert(20);
        b.insert(60);
        b.insert(10);
        b.insert(25); 
        b.insert(59);
        b.insert(70);
     
        
        
        System.out.println(b.Hight()); 
        System.out.println(b.IsBalnced());
      
        b.PostOrder();
        

    }

}
