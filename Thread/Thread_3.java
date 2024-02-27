
package Thread;


public class Thread_3   implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
    
    
    public static void main(String[] args) {
        
        Thread_3 t =new Thread_3(); 
        Thread d =new Thread(t); 
        d.start();
        
        
        
        
    }
    
    
}
