
package ThreadGroup;


public class MainThreadGroup {
    
    
    
    public static void main(String[] args) {
        
        
      // tg إسمه ThreadGroup هنا قمنا بإنشاء كائن من الكلاس
        ThreadGroup tg = new ThreadGroup("tg group");
 
        // tg ثم جعلناه ينتمي لمجموعة الكائن t1 إسمه Thread و ربطناه بكائن من الكلاس MyRunnable هنا قمنا بإنشاء كائن من الكلاس
        Thread t1 = new Thread(tg, new MyRunnable(), "Thread 1");
 
        // tg ثم جعلناه ينتمي لمجموعة الكائن t2 إسمه Thread و ربطناه بكائن من الكلاس MyRunnable هنا قمنا بإنشاء كائن من الكلاس
        Thread t2 = new Thread(tg, new MyRunnable(), "Thread 2");
 
        // t1 هنا قمنا بتشغيل الكائن
        t1.start();
 
        // t2 هنا قمنا بتشغيل الكائن
        t2.start();
 
        // يعدها سيتم إيقاف تنفيذ باقي الأوامر الموجودة في البرنامج مدة ثانية واحدة
        try {
            Thread.sleep(1000);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
 
        // tg تابع للكائن Thread بعد إنقضاء الثانية سيتم إيقاف تنفيذ كل
        tg.interrupt();
 
        // في الأخير سيتم عرض الجملة التالية
        System.out.println("All Threads in 'tg group' are interrupted!");
   
    }  
}
