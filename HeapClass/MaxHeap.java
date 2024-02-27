
package HeapClass;

import mydatastructre.MyArrayList;


public class MaxHeap<T extends Comparable<T>> {
    
    private MyArrayList<T> list = new MyArrayList<T>();

    public MaxHeap() {

    }

    public MaxHeap(T Object[]) {
        for (int i = 0; i < Object.length; i++) {
            add(Object[i]);
        }

    }
    
    
    
    // Max Heap 
    public  void add(T value) {

        list.add(value);
        int currentIndex = list.getsize() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) >  0) {
                T temp = list.get(currentIndex);
                list.set(list.get(parentIndex), currentIndex);
                list.set(temp, parentIndex);

            } else {
                break;
            }

        }




    }
    public int getsize() {

        return list.getsize();
    }

    public String ToString() {

        return list.toString();
    }
    
    
 
    
    
    public static void main(String[] args) {
        
        MaxHeap<Integer> h = new MaxHeap<>(); 
        h.add(48);
        h.add(21);
        h.add(20);
        h.add(30);
        System.out.println(h.ToString());
        System.out.println(h.getsize());
        
        
        
    }
    
    
    
}
