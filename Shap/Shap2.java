
package Shap;

import java.util.Scanner;


public class Shap2 {
    
    
    
    
    public static void main(String[] args) {
      
        System.out.println("Enter The Number OF Stares!");
        int n = new Scanner(System.in).nextInt(); 
        printShap9(n);
        
        
        
    }
    
    public static void printShap1(){
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
     }
   
     public static void printShap2(){
        int n = 5;                           // 5 
        for (int i = 1; i <= n; i++) {      //  i =1 2    
             for (int j = n; j >=1; j--) {  //   j = 5 4 3  2  1 
                 if(i>=j){                  //    
                     System.out.print("* ");
                }else {
                     System.out.print(" ");
                 }
                   

            }
     
            System.out.println("");
        }
        
        
     }
     /*
    *****
     ****   
       **
        *
     
    
    */
    
     // Left Triangle 
     public static void printShap3(int num ){
        int n = num;                            
        for (int i = n; i >=1; i--) {      
             for (int j = n; j >=1; j--) {   
                 if(i>=j){                      
                     System.out.print("*");
                }else {
                     System.out.print(" ");
                 }
            }
     
            System.out.println("");
        }
        
        
     }
    
    // Hill Patteren 
      public static void printShap4(int num){
         int  n =num; 
          for (int i = 1; i <= n; i++) {
                                              // i =5 
              for (int j = 1; j <= n-i; j++) { // j = 1 ..> 4 
                  System.out.print(" ");
              }
              for (int j = 1; j <= i*2-1; j++) {
                  System.out.print("*");
              }
              
              System.out.println("");
          }
          
        
        
     }
     
      
      /*
      *****
       ***
        *
      */
       // Reverce Hill Patteren 
       public static void printShap5(){
         
          for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < 5; j++) {
                    System.out.print("*");
              }
                 for (int j = i; j <= 5; j++) {
                    System.out.print("*");
              }             
       
              System.out.println("");
          }
          
        
        
     }
       // Dimoned Pattren  
        public static void printShap6(int num){
           int n =num ;
            for (int i = 1; i <= n; i++) {
                                            // i =5 
              for (int j = i; j <= n; j++) { // j = 1 ..> 4 
                  System.out.print(" ");
              }
              for (int j = 1; j <= i*2-1; j++) {
                  System.out.print("*");
              }
              
              System.out.println("");
          }
          for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < n; j++) {
                    System.out.print("*");
              }
                 for (int j = i; j <= n; j++) {
                    System.out.print("*");
              }             
       
              System.out.println("");
          }
        
        
     }
       
          public static void printShap7(int num){
           int n =num ;
            
              for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                     if( j ==0 || j == n-1 || i ==0 || i==n-1 ){
                         System.out.print("*");
                       }else {
                         System.out.print(" ");
                     }     
                  }
    
                  System.out.println("");
              }
    
     }
          
          
          public static void printShap8(int num){
           int n =num ;
            
              for (int i = 1; i <=n; i++) {
                  for (int j = 1; j <= n; j++) {
                     if( i==n/2+1 || j ==n/2+1 ){
                         System.out.print("* ");
                       }else {
                         System.out.print(" ");
                     }     
                  }
    
                  System.out.println();
              }
    
     }
          
          // Cross Pattren 
              public static void printShap9(int num){
              int n =num ;
            
                      for (int i = 1; i <=n; i++) {
                  for (int j = 1; j <= n; j++) {
                     if( i==j || i+j ==n+1){
                         System.out.print("* ");
                       }else {
                         System.out.print(" ");
                     }     
                  }
    
                  System.out.println();
              }
    
     }
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
}
