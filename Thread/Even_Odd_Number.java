
package Thread;


public class Even_Odd_Number implements Runnable{
     
    private int arr[]; 
    
    
    public Even_Odd_Number(int a[] ){
     this.arr = a; 
    
     }

    @Override
    public void run() {

          RunEven();
          System.out.println("");
          RunOdd(); 

    }

    private void RunEven() { // (Private Method  )Canot mack Override  in sub Class 
        
         synchronized(arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2== 0 ){
                System.out.print(arr[i]+" ");
            }
        }
       try{
        Thread.sleep(1000);  // Sleep Delay 1000 msecounds 
       }catch(InterruptedException e ){
       
       } 
         }
    }

    private void RunOdd() { // (Private Method  )Canot mack Override  in sub Class 
        
         synchronized(arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!= 0 ){
                System.out.print(arr[i]+" ");
            }
        }
       try{
        Thread.sleep(1000);
       }catch(InterruptedException e ){
       
       } 
         }
    }
    
    
    public static void main(String[] args) {
        
        int arr[] ={1,0,4,3,7,5,8,9,10}; 
        
        Even_Odd_Number e = new Even_Odd_Number(arr); 
        Thread t =new Thread(e);
        t.start();
        
        
        
        
        
        
    }
    
     
}
