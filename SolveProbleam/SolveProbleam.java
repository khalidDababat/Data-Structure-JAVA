package SolveProbleam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SolveProbleam {

    public static void main(String[] args) {
          
       PrintMax(2,3,4,new Scanner(System.in).nextDouble()); 
        
      //  max(); 
    }

  public static void max (){
       System.out.println("How many numbers:");
       double []arr = new double[new Scanner(System.in).nextInt()];  
  
       for (int i = 0; i < arr.length ; i++) {
           System.out.print(i+1 + ":");
           arr[i] = new Scanner(System.in).nextDouble();
           
      }
       
      PrintMax(arr);  
       
   }
        
    
    public static void  PrintMax (double ... numbers){ //Variable Length 
    
        if(numbers.length ==0 ){
            System.out.println("no exist  Numbers  ");
         }
        double max = numbers[0];  // 3 1 4 1 
        for (int i = 0; i < numbers.length; i++) { // O(n)
            if(max < numbers[i]){
            max  = numbers[i] ; 
             }
        } 
        
        System.out.println(" the Maximum Number is "+ max );
    
     }
    
    
         
    

}
