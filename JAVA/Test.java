package JAVA;

public class Test {

    int x;
    int y;

    public Test() {
//    this(10,5);
        x = 10;
        this.y = 20;

    }

    public Test(int x, int y) {
//        this.x = x;
//        this.y = y;
        this();
    }

    public void print() {

        System.out.println("x= " + x + "y= " + this.y);
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t1 = new Test(5, 7);
        t.print();
        t1.print();

    }

    public static int minOperations(int n) {  // 3 
        int avg = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {  // 0 -1 -2 -  < 3   i =0 1 2 3  n+1 Iteration 
            sum += (2 * i) + 1; // sum = 4  +5  = 9 
        }
        avg = sum / n; // 9/3 = 3 

        for (int i = 0; i < n; i++) { // 0 ... <3 
            int no = (2 * i) + 1;// 3 
            if (no < avg) {
                count += (avg - no); // count = 2 
            }
        }
        return count;

    }

}
