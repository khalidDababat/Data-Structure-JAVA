
package Queue;

import Stack.MyStack;
import java.util.Stack;


public class QueueByStack<T> {
    
    MyStack<T> s = new MyStack<>(); 
    
//    private int size =0 ; 
    
    public QueueByStack(){
    
    
    
     }
    
    public void Enqueue(T e ){
       s.Push(e);
       
    
     }
    
    public T Dqueue(){
        MyStack<T> s1 = new MyStack<>(); 
        T e ; 
     
        while(!s.isempty()){
        s1.Push(s.pop());
        
         }
        e = s1.pop(); 
        
        while(!s1.isempty() ){
        s.Push(s1.pop());
    }  
        return e;
       
     }
    
    
    
    
    public int getSize(){
    return s.size()  ; 
     }
    
    
    public boolean Isempty(){
    return s.isempty(); 
    
     }
    
    public String ToString(){
    return s.ToString(); 
    }
    
    
    
    public static void main(String[] args) {
        
        QueueByStack<Integer> q =new QueueByStack<>(); 
        q.Enqueue(100);
        q.Enqueue(200);
        q.Enqueue(300);
        System.out.println(q.ToString());
        System.out.println(q.getSize());
        System.out.println(q.Dqueue());
      
        
        
    }
    
}
