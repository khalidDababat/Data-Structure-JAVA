package Quastion2;

public class thread implements Runnable {

    MyLock m;

    public thread(MyLock m) {
        this.m = m;

    }

    @Override
    public void run() {
        try {
            synchronized (m) {
                while (true) {

                    while (m.flag != 1) {
                        m.wait();
                    }
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                    m.flag = 2;
                    m.notify();

                }

            }
        } catch (InterruptedException e) {
        }

    }
}

   
    
   
    
 





