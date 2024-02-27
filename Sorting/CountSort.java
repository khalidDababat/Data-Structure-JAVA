
package Sorting;

import java.util.Arrays;


public class CountSort {
  /* 
    
    Khalid Ahmad Younes Dababat 201910853 
    
    
     
    */
    
    public static  void Count_Sort(int arr[]){ // the Time Complixity ..> O(N)
     
        if(arr ==null || arr.length ==0 ){
         return; 
         }
        
        
       int  n = arr.length; 
       int output[] = new int[n];
       
        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
       
       
       int count[] = new int[max +1];
       
       
       //Store the Count Of each Element in the Array 
        for (int i = 0; i < arr.length ; i++) {
          count[arr[i]]++; 
        }
       
        //Modify the Count Array 
        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1]; 
        }
    
        /// Traverse the input array in reverse order 
        for (int i = n-1; i >=0 ; i-- ) {
            output[--count[arr[i]]] =arr[i]; 
          
        }
        
        //Copy the elemnts from the Temprory Array to Original Array 
        for (int i = 0; i < n; i++) {
            arr[i] =output[i];  
        }
        
        
        
        
     }
    
    
    
    public static void main(String[] args) {
        int arr[]={1,4,1,2,7,5,2};  
        Count_Sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    
}
