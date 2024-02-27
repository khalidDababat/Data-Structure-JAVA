package Hash;

import java.util.Map;
import java.util.TreeMap;

public class Example2 {

    public static void main(String[] args) {

        String txt = "Good morning Have a Good Class." + "Have a Good visit.Have Fin!";
        String[] Words = txt.split("[.]");
        Map<String, Integer> m = new TreeMap<>();

        for (int i = 0; i < Words.length; i++) {
            String key = Words[i].toLowerCase();
            if (key.length() > 0) {
                if (!m.containsKey(key)) {
                    m.put(key, i);
                } else {
                    int value = m.get(key);
                    value++;
                    m.put(key, value);
                }

            }

        }
        for (Map.Entry<String, Integer> entry : m.entrySet()) { // For each 
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " "+ value );
        }

    }

}
