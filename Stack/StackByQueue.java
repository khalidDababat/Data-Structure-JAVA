package Stack;

import Queue.MyQueueNode;
import java.util.Stack;
import javax.naming.OperationNotSupportedException;

public class StackByQueue<T> {

    MyQueueNode<T> q = new MyQueueNode();
    private int size = 0;

    public StackByQueue() {

    }

    public void push(T e) {
        q.EnQueue(e);
        size++;
    }

    public T pop() {
        Stack<T> s1 = new Stack<>();
        Stack<T> s2 = new Stack<>();
        if (q.Isempty()) {
            throw new UnsupportedOperationException("the stack is empty! ");
        } else {
            while (!q.Isempty()) {
                s1.push(q.DeQueue());
            }
        }
        T e = s1.pop();
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        while (!q.Isempty()) {
            q.EnQueue(s2.pop());
        }
        size--;
        return e;

    }

    public int getSize() {
        return size;

    }

    public String ToString() {
        return q.ToString();

    }

    public boolean Isempty(){
     return size ==0;  
     
     }
    
    
    
    public static void main(String[] args) {

        StackByQueue<Integer> s = new StackByQueue<>();
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        System.out.println(s.ToString());
        System.out.println(s.pop());
        System.out.println(s.getSize());

    }

}
