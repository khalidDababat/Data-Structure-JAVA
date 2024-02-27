
package Thread;


public class Thread_4 extends Thread  {
    
    
    @Override
    public void run(){
    
        System.out.print("Hallo from "+ this.getName());
    
     }
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 4; i++) {
            new Thread_4() .start();
           
        }
         System.out.println("Hello from  "+ Thread.currentThread().getName());
        
    }
    
    
    
    
    
    
    
}
