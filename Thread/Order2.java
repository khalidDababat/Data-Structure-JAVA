package Thread;

import java.util.Scanner;

public class Order2  implements Runnable {

    private int temp = 0;
    private int arr[];

   

    public Order2(int arr[]) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }

    }
    
    
    @Override
    public void run() {
        synchronized (arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                }

            }
        }
        print();
    }

    public void print() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Order1 o1 = new Order1(arr);
        Order2 o2 = new Order2(arr);

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);

        t1.start();
        System.out.println("");
        t2.start();
        
        
        
        

    }

}
