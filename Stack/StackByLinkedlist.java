
package Stack;

import java.security.PublicKey;
import mydatastructre.MylinkedList;

public class StackByLinkedlist<T> {
    
    private MylinkedList<T> list = new MylinkedList<>(); 

  
    public StackByLinkedlist(){
    
    }
    
    public void push(T e ){
       list.addlast(e);
     }
     public T pop() {

        T element = list.getLast();
        list.removeLast();
        return element;
    }
    
     
     
      public T peek() {
        // return list.get(list.size()-1 ); 
        return list.getLast();
    }
     
     
     
     
     public int IndexOf(T e ){
        return list.indixof(e); 
      }
     
       public String toString() {

        return list.ToString(); 

    }
     
       public int search(T value) {

        int i = 1;
        for (int j = list.size() - 1; j >= 0; j--) {
            if (list.equals(value)) {
                return i;

            }
            i++;
        }
        return -1;
    }
     
    
        public int getsize() {
        return list.size();

    }
       
       
        public boolean IsEmpty(){
          
    return list.isEmpty(); 
        
    
        }
        
        
       //reverce Stack in Linked List 
        public  void reverce(){
       if(!IsEmpty()){
        T top = pop();
        reverce(); 
        list.addFirst(top);
           
           
       }
        }
        
        
        
       
    }

    
    
    
    
    
    
    
    
    
    

