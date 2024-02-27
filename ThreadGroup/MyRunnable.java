/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadGroup;

/**
 *
 * @author hp
 */
public class MyRunnable  implements  Runnable{

    @Override
    public void run() {
             // true ترجع isInterrupted() طالما أن الدالة
        while(!Thread.currentThread().isInterrupted())
        {
            // الذي يتم تنفيذ محتواه في الوقت الحالي Thread سيتم طباعة إسم كائن الـ
            System.out.println(Thread.currentThread().getName());
        }    }
    
}
