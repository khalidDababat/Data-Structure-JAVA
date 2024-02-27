
package mydatastructre;


public class Node<T> {
    
    public T data ; 
    public Node<T> next ; 
    
    public Node(T data){
     this.data =data ; 
    
     }
    
    

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public T getData(){
     return this.data; 
     }
    
    public Node<T> getNext(){
        return this.next; 
     }
    
    
    
    
    
}
