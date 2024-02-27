package Stack;

import java.lang.reflect.Array;
import mydatastructre.MyArrayList;

public class MyStack<T> {

    private MyArrayList<T> list = new MyArrayList<T>();

    public MyStack() {

    }

    public int size() {
        return list.getsize();
    }

    public void Push(T e) {
        list.add(e);

    }

    public void pushFirst(T e) {
        if (list.getsize() == 0) {
            Push(e);

        } else {
            T top = pop();
            pushFirst(e);
            Push(top);

        }

    }

    
    
    public int getSize() {
        return comuteSize(0);

    }

    
    
    private int comuteSize(int count) {

        if (!isempty()) {
            T top = pop();
            count += comuteSize(1);
             Push(top);

        }
       
        return count;

    }

    
    
    
    
    
    
    public T pop() {
        if (list.Isempty()) {
            throw new UnsupportedOperationException("Stack is empty ");
        }
        T e = list.get(list.getsize() - 1);
        list.deletelast();
        return e;
    }

    public String ToString() {

        return list.toString();

    }

    public T peek() {

        return list.get(list.getsize() - 1);

    }

    public boolean isempty() {
        return list.Isempty();

    }

    public int Search(T value) {
        if (list.contains(value)) {
            return list.indexOf(value);

        }
        return -1;
    }

    public int indixof(T value) {
        return list.indexOf(value);

    }
    
    
    
    public static void main(String[] args) {
        
        MyStack<Integer> s= new MyStack<>(); 
        s.Push(100);
        s.Push(200);
        s.Push(300);
        System.out.println(s.ToString());
     System.out.println(s.getSize());
        System.out.println(s.pop());
        System.out.println(s.getSize() );        
    }

}
