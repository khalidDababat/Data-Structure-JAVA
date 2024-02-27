
package IteratorCursor;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Iterator1 {
    
    
    public static void main(String[] args) {
        
         LinkedList l = new LinkedList<>(); 
         Scanner sc = new Scanner(System.in); 
         
         for (int i = 0; i < 5; i++) {
            l.add(sc.nextInt());
        }
         
         
         Iterator<Integer> it = l.iterator(); 
         
         while(it.hasNext()){
             
            //  System.out.println(it.next());
            int x = it.next(); 
            if(x%2 != 0 ){
              it.remove();
            }
             
          }
         
                 System.out.println(l);

         
    }
    
    
    
    
    
    
    
    
    
    
}
