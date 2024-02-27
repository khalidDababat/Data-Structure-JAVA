
package Thread;


/* 
1- extendes thread 
2- Create Method name Run ; XXX  
3- in main  Start() method  



*/



public class Thread_2 extends Thread{
    
    
    @Override
    public void run(){                    //  هيك كانه انا استدعيت مثود عاد من المثةد الموجود في الانترفيس  
        for (int i = 0; i < 5; i++) {    ///     Run()    
            System.out.println(i);
        }
    
     }
    
    
    
    
    public static void main(String[] args) {
        
        Thread_2 t =new Thread_2(); 
        t.start();   // t.run()
      //        t.run(); // مابزبط صار زي استدعاء عادي  ماله دخل بالثريد 
      
     
        for (int i = 0; i < 5; i++) {
            System.out.print("A");
        }
        
        
    }
    
    
    
    
    
    
}
