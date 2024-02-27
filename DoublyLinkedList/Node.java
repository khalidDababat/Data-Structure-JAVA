
package DoublyLinkedList;


public class Node<T>{
    
    public T data ; 
    public Node<T> next ; 
    public Node<T> Prev ; 
    
     public Node(T data){
     this.data =data ; 
    
     }
    
     public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    } 
    
    public void setPrev(Node<T> Prev){
       this.Prev =Prev; 
     }
    
    
    public Node<T> getPrev(){
     return this.Prev; 
    
     }
    public T getData(){
     return this.data; 
     }
    
    public Node<T> getNext(){
        return this.next; 
     }
}
