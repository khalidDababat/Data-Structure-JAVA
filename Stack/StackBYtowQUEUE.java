
package Stack;

import java.util.LinkedList;
import java.util.Queue;
import mydatastructre.Node;

public class StackBYtowQUEUE<T> {
    
    
          private Queue<T> q1 =new LinkedList<>(); 
          private Queue<T> q2 =new LinkedList<>(); 

          
          public void Push(T e ){
           q1.offer(e);         
          
           }
          
          public T POP(){
           if(q1.isEmpty()){
            throw new UnsupportedOperationException("the stack is empty! ");
           }
          while(q1.size() > 1 ){
            q2.offer(q1.poll()); 
          
           }
           T poppedValue = q1.poll();
           
           Queue<T> temp = q1;
           q1 =q2 ; 
           q2 = temp; 
           
           return poppedValue; 
           }
          
          
          
        public T Peek(){
        
             if(q1.isEmpty()){
               throw new UnsupportedOperationException("The Stack IS Empty!");
             }
         while(q1 .size() >1 ){
           q2.add(q1.poll()); 
          }
          T e  = q1.peek();
          q2.offer(q1.poll()); 
           
            Queue<T> temp = q2; 
            q1 =q2; 
            q1 =temp;  
            
            return e ;
         
             
         }  
          
           
           
        
        public T Poll(){
          if(q1.isEmpty()){
            return null; 
          
           }
        while(q1.size() >1 ){
         q2.offer(q1.poll()); 
        
         }
            T e  = q1.poll(); 
             Queue<T> temp = q2; 
             q1 =q2; 
             q1 =temp;  
            
            return e ;
        
         }
        
        
        
          public void PrintStack(){
              
              System.out.println(q1);
           }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
    
    
    public static void main(String[] args) {
            
           StackBYtowQUEUE<Integer> s = new StackBYtowQUEUE(); 
           s.Push(100);
           s.Push(200);
           s.Push(300);
          
          // s.Poll(); 
           System.out.println(s.Poll());
          
          s.PrintStack();
          
     
       
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
