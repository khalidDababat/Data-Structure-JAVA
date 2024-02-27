package Shap;

public class Shap {

    public static void main(String[] args) {

        printFinal();

    }

    public static void printShap1() {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(2 * (i + j) - 3 + " ");

            }
            System.out.println("");
        }

    }

    public static void printShap2() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + "" + i);
            }
            System.out.println();
        }

    }

    public static void printShap3() {
        for (int i = 1; i <= 5; i++) { // i =1 

            for (int j = 1; j <= 5; j++) { // j =1 ..> 

                System.out.print(2 * (i + j) - 3 + " ");

            }

            System.out.println();
        }

    }

    public static void printShap4() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i + j) - 1 + " ");
            }
            System.out.println("");
        }

    }

    public static void printShap5() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println("");
        }

    }

    public static void printchar1() {

        for (int i = 'A'; i <= 'E'; i++) {
            for (int j = 'A'; j <= 'E'; j++) {
                System.out.print((char) i);
            }

            System.out.println("");
        }

    }

    public static void printchar2() {
        char a = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(a + " ");
                if (a < 'Z') {
                    a++;
                } else {
                    a = 'A';
                }
            }
            System.out.println("");
        }
    }

    public static void print12() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println("");
        }

    }

    
    
    public static void print13() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*(i+j)-3+" ");
            }

            System.out.println("");
        }

    }
    
     public static void printFiboNtio() {   // 0   1  1   2  3      
         int n1 = 0 ,n2 = 1 ,res =(n1+n2);  //            n1 n2  
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(res + " ");
                res =(n1+n2);
                n1 = n2 ;
                n2 = res; 
               
            }

            System.out.println("");
        }

    }
    
    public static void printFiboNtioPayrmend() {   // 0   1  1   2  3      
         int n1 = 0 ,n2 = 1 ,res =0;  //                  n1 n2  
         for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                
                n1 = n2 ;
                n2 = res; 
                System.out.print(res + " ");
                res =(n1+n2); 
                
            }
            n1 = 0 ; 
            n2 = 1 ;
            res =0;  
            System.out.println("");
        }

    }
    
    
    
     public static void printFinal() {       
          
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
              if(i %2 ==0 ){
                  System.out.print("1 ");
               }else {
                  System.out.print("0 ");
               }
              
               
            }

            System.out.println("");
        }

    }

}
