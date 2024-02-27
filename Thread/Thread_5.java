//
package Thread;



public class Thread_5  implements Runnable{

     @Override
    public void run() {
         for (int i = 0; i < 5; i++) {
            try{
            
                 Thread.sleep(1000);
                System.out.print(i + "  ");
             }catch(InterruptedException e ){   // InterruptedException 

             }
            
            
            
        } 
      
        }
    
    
    public static void main(String[] args) {
        
        Thread_5 t =new Thread_5(); 
        Thread d = new Thread(t); 
        d.start();
        
//        for (int i = 0; i < 5; i++) {   Shotrest Job Ferst 
//            System.out.println(i);
//        }
        
        
    }

   
     
}
