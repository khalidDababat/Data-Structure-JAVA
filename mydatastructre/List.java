
package mydatastructre;

public interface List<E> {
    
    
   
    
     public void add(E e);

    public void add(int index, E e);

    public E removByIndex(int index);

    public E remove(E e);

    public void clear();

    public boolean isempty();

    public E get(int index);

    public int indexOf(E e);

    public int lastIndexOf(E e);

    public boolean contains(E e);

    public int size();

    
    
    
    
}
