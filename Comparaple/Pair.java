package Comparaple;

import java.util.Arrays;

public class Pair implements Comparable<Pair> {

    String x;
    int y;

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;

    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Pair o) {
        // if the string are not equal
        if (this.x.compareTo(o.x) != 0) {
            return this.x.compareTo(o.x);

            // we compare int values
            // if the strings are equal
        } else {

            return this.y - o.y;
        }

    
    }

    
    public static void main(String[] args) {
        
        int n = 4 ; 
        Pair[] arr =new Pair[n]; 
        
        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);
       
      Arrays.sort(arr);
        
        print(arr);
    }
    
    
 public static void print(Pair[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}