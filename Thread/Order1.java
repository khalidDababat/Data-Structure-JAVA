/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.Scanner;

// Asending and decending 
public class Order1 implements Runnable{
    
        
   public     int temp =0 ; 
   public      int arr[]; 

 
   
   
   
   
   
   public Order1(int arr[] ){
   this.arr =new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
           this.arr[i] =arr[i];
       }
   
   }
    
     @Override
    public void run() {

    synchronized(arr){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j =i+1 ; j < arr.length; j++) {
            if(arr[i] >arr[j]){
             temp =arr[i]; 
             arr[i] =arr[j]; 
             arr[j]= temp ; 
            
        } 
            
            
            
        }
        try{
            
            Thread.sleep(1000);
        }catch(InterruptedException e ){
            
        }
    }

 }     
    print(); 
    }
    
       public void print() {

           for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
           }
           System.out.print("\n");
       
       
       }
    
    
    public static void main(String[] args) {
        
        
         Scanner sc =new Scanner(System.in);
        int arr[] = new int[5]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        Order1 o =new Order1(arr);
        Thread t = new Thread(o);
        t.start();
    }

 

   
}
