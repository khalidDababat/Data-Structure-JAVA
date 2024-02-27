package HeapClass;

import java.util.PriorityQueue;
import mydatastructre.MyArrayList;

public class HeapClass<T extends Comparable<T>> {

    private MyArrayList<T> list = new MyArrayList<T>();

    public HeapClass() {

    }

    public HeapClass(T Object[]) {
        for (int i = 0; i < Object.length; i++) {
            add(Object[i]);
        }

    }

    // Min Heap  Class 
    public void add(T value) {
        list.add(value);
        int currentIndex = list.getsize() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
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
 
    
    
    public T remove(){
        
        if(list.getsize() ==0 ){
         return null ; 
         }
        
        T e = list.get(0);
        list.set(list.get(list.getsize()-1 ), 0);
        list.removeByIndex(list.getsize()-1); 
        int currentIndex = 0;
        while(currentIndex < list.getsize()){
        int liftChildIndex = (2*currentIndex)+1; 
        int RightChildIndex = (2*currentIndex)+2; 
        if(liftChildIndex >=list.getsize()){
         break ; 
         }
           int maxIndex = liftChildIndex ;  
         if(RightChildIndex < list.getsize()){
         
             if(list.get(maxIndex).compareTo(list.get(RightChildIndex))<0 ){
              maxIndex =RightChildIndex; 
             
              }
             if(list.get(currentIndex).compareTo(list.get(maxIndex))< 0 ){
              T temp = list.get(currentIndex); 
              list.set(list.get(maxIndex), currentIndex);
              list.set(temp, maxIndex);
             currentIndex =liftChildIndex;  
              }else {
             break ; 
              }
          } 
        
        
        }
        return e ; 
    } 
    
    
    
    
   
    
    
    
    
    
    public static void main(String[] args) {

        HeapClass<Integer> h = new HeapClass<>();
        h.add(10);
        h.add(15);
        h.add(4);
        h.add(1);
        System.out.println(h.ToString());
        System.out.println(h.getsize());
        
        
    }

}
