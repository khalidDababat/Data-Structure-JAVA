package BinaryTree;

public class AVL<T> extends BST {

    public AVL() {

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

}
