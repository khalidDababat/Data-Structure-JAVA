package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class Examples {
 
    static int n1 = 0 , n2=1 ; 
    
    
   
    
    
    
  
    
    
     
    public static void main(String[] args) {

      
        //System.out.println(sum(4,6));
        //  fun(); 
       


     


      
    }

    
    
    
    // Sum Between Tow Numbers 
 public static int sum(int n1 ,int n2 ){ //  6...4      6+5+4
          if(n1 ==n2 ){
           return n1; 
          }
          if(n1 <n2 ){
          return n1 + sum(n1+1,n2); // 
          } else {
              
              return n1 + sum(n1-1,n2); 
              
          }

     }

    
    
      public static void PrintFibo(int n  ){ // 0 1 1 2 3 5 8    3 
         int n3 ;    
        if(n > 0 ){
         n3 = n1+n2 ; // 2  
         n1 =n2 ;  // 1 
         n2 =n3 ;  // 2 
            System.out.print(" "+n3 ); // 3 2 
            PrintFibo(n-1);
            
            
         }
    
     }
    
    
    // StackOverFlow  Error 
    public static void fun() {
        int A = 10;
        int B = 20;
        int C = 30;
        fun();

    }

    public static void Print(String str) {
        if (str == null || str.equals("")) {
            return;

        } else {
            System.out.print(str.charAt(str.length()-1));
            Print(str.substring(1));
        }

    }

    public static int sum(int[] a, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return sum(a, n - 1) + a[n - 1];
        }

    }

    public static int sum(int[] a) { // [1,2,3,4]
        return sum(a, a.length);

    }

    public static int Fib(int n) { //o(2^n )

        System.out.println("n= " + n);
        if (n == 0) {
            return 0;

        }
        if (n == 1) {

            return 1;
        }

        return Fib(n - 1) + Fib(n - 2);

    }

    public static int fibo(int n) { //O(n)

        return fibo(1, 0, n);

    }

    public static int fibo(int curr, int pre, int n) {

        if (n <= 1) {
            return curr;
        } else {
            return fibo(curr + pre, curr, n - 1);
        }

    }

}
