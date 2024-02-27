
package Thread;


public class Thread_6  extends Thread{
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("B");
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) throws InterruptedException {
        Thread_6 t = new Thread_6(); 
       
        
        t.join();
        t.start();
        for (int i = 0; i < 50; i++) {
            System.out.print("A");
        }
             
        
    }

    
}
