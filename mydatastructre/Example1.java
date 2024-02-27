
package mydatastructre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Example1 {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        ArrayList<LinkedList<String>> list = new ArrayList<>(); 
        String str ;
        
        // Initialize the array list with linked lists
        for (int i = 0; i < 26; i++) {
           list.add(new LinkedList<>()); 
                
        }
       
      
    
       while(true){
        
           System.out.println("Enter String Until -STOOOOP- to stop  ");
           str =in.next().trim(); 
           
           if(str.equalsIgnoreCase("STOOOOP") ){
              break; 
            }
           if(Character.isLetter(str.charAt(0))){
               int i = Character.toLowerCase(str.charAt(0))-'a'; // 0 .... 25
              
               list.get(i).add(str); 

           } 
           
        }
       
       
       // Desplay 
         for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                
                System.out.print(list.get(i).get(j) + ",");
            }
            
            System.out.println("");
        } 
        
    }
    
    
    
    
    
    
    
    
    
    
}
