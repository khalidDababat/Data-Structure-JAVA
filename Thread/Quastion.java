package Thread;

import java.util.Scanner;

public class Quastion implements Runnable {

    String a[] = {"Whats Youre Names?", "How are You ? ", "What is Age?"};
    int index = 0;
    Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        while (index <3) {

            if (Thread.currentThread().getName().equals("q")) {
                System.out.println(a[index++]);
                synchronized (this) { // تمنع انه اوبجيكت ثاني يدخل على البيانات غير هذا الاوبجكيت 
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }

                }

  
             }else {
             sc.nextLine(); 
             synchronized(this ){
              notify(); // Wake Up 
             
              } 
            
             }

        }

    }

    public static void main(String[] args) {
        Quastion q1 = new Quastion(); 
        Thread t1 = new Thread(q1,"q");
        Thread t2 = new Thread(q1,"A");
        t1.start();
        t2.start();
        
        
        
        
    }

}
