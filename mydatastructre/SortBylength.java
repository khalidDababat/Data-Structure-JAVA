package mydatastructre;

import java.util.Arrays;
import java.util.Comparator;
import sun.security.pkcs11.Secmod;

public class SortBylength implements Comparator<String> {

    private static void sortLength(String[] str) {

        Arrays.sort(str, new SortBylength());
    }

   

    @Override
    public int compare(String First, String secounds) {

        return Integer.compare(First.length(), secounds.length());

    }
    
    
    

    public static void main(String[] args) {

        String[] s = {"Ahmad", "Ali ", "mohmad", "of", "x"};
        System.out.println(Arrays.toString(s));
        
       sortLength(s);
        System.out.println(Arrays.toString(s));
    }

}
