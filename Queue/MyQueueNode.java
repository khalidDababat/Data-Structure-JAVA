package Queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import mydatastructre.MylinkedList;

public class MyQueueNode<T> {

    private Node<T> head;
    private Node<T> till;
    private int size = 0;

    public MyQueueNode() {

    }

    public void EnQueue(T value) { //O(N)
        Node<T> newNode = new Node(value);
        if (till == null) {
            head = till = newNode;
        } else {
            till.setNext(newNode);
            till = newNode;

        }

        size++;
    }

    public T Peek() {
        if (head == null) {
            return null;
        }
        return head.getData();

    }

    public T DeQueue() { //O(1)
        if (head == null) {
            return null;
        }
        T e = head.getData();
        head = head.getNext();
        size--;
        return e;
    }

     public String ToString() {

        Node<T> curr = head;
        String str = "[";
        while (curr != null) {
            str += curr.getData() + ",";
            curr = curr.getNext();
        }
        return str + "]";
    }
    
    
    public boolean Isempty(){
         return size ==0 ;     
    
     }
    
    
    public int getSize(){
     return size ; 
    
     }
    
   
    public static int SumOfEven (MyQueueNode <Integer> q){
     
     
     int sumEven =0 ;
     if(q.Isempty()){
       return 0 ; 
      }
     int element = q.DeQueue(); 
     
     sumEven= SumOfEven(q); 
     
     if( element % 2==0 ){
       sumEven += element; 
         
      }
     
     return sumEven;    
    } 
    
    
    
    public static void main(String[] args) {
        
        MyQueueNode<Integer> q = new MyQueueNode<>(); 
        q.EnQueue(1);
        q.EnQueue(3);
        q.EnQueue(4);
        q.EnQueue(6);
        System.out.println(q.ToString()); 
        System.out.println(q.SumOfEven(q));
        System.out.println(q.ToString()); 

        
    }
    

}
