package BinaryTree;

public class Node<T> {

    public  Node<T> Right;
    public Node<T> Left;
    public T data;

    public Node(T data) {
        this.data = data;
        Right = null;
        Left = null;

    }

    public void setRight(Node<T> Right) {
        this.Right = Right;
    }

    public void setLeft(Node<T> Left) {
        this.Left = Left;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getRight() {
        return Right;
    }

    public Node<T> getLeft() {
        return Left;
    }

    public T getData() {
        return data;
    }

}
