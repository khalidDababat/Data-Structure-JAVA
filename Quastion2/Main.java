/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quastion2;

/**
 *
 * @author hp
 */
public class Main implements Runnable {
      MyLock m;

        public Main(MyLock m) {
            this.m = m;

        }

        @Override
        public void run() {
            try {
                synchronized (m) {
                    while (true) {

                        while (m.flag != 2) {
                            m.wait();
                        }
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(1000);
                        m.flag = 1;
                        m.notify();

                    }

                }
            } catch (InterruptedException e) {
            }

        }


    public static void main(String[] args) {
        
          /*
        EX:  
        use two thread and print one times (main ) and secounds times (Thread) and Continue Printing
        */
        Thread t1 =new Thread(); 
        Thread t2 =new Thread();
        
        
        
        
        
        
    }

 }
 

   