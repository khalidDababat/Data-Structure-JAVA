
package IteratorCursor;

import java.util.ArrayList;
import java.util.ListIterator;


public class LastIterator1 {
     
    public static void main(String[] args) {
        
        
        ArrayList<Integer> t = new ArrayList(); 
        t.add(1); 
        t.add(2); 
        t.add(3); 
        t.add(4); 
        t.add(5); 
 
          ListIterator<Integer> it = t.listIterator(t.size()); 
          
          while(it.hasPrevious()){
              
             
              System.out.println(it.previous());
              
              
              
              
           }
       
        
        System.out.println(t);
        
        
    }
    
    
    
}
