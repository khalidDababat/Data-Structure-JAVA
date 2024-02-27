package DoublyLinkedList;

public class DoublyLinkedList<T> {

    private Node<T> head, tail;
    private int size = 0;

    public DoublyLinkedList() {

    }

    // Adding a node at the front of the list
    public void AddFirst(T new_data) // O(1)
    {
        // 1. allocate node
        // 2. put in the data */
        Node new_Node = new Node(new_data);

        // 3. Make next of new node as head and previous as NULL
        new_Node.next = head;
        new_Node.Prev = null;

        // 4. change prev of head node to new node
        if (head != null) {
            head.Prev = new_Node;
        }

        // 5. move the head to point to the new node
        head = new_Node;
        size++;
    }

// Given a node as prev_node, insert a new node 
// after the given node
    public void InsertAfter(Node prev_Node, int new_data) {
        // Check if the given prev_node is NULL
        if (prev_Node == null) {
            System.out.println(
                    "The given previous node cannot be NULL ");
            return;
        }

        // 1. allocate node
        // 2. put in the data 
        Node new_node = new Node(new_data);

        // 3. Make next of new node as next of prev_node
        new_node.next = prev_Node.next;

        // 4. Make the next of prev_node as new_node
        prev_Node.next = new_node;

        // 5. Make prev_node as previous of new_node
        new_node.Prev = prev_Node;

        // 6. Change previous of new_node's next node
        if (new_node.next != null) {
            new_node.next.Prev = new_node;
        }
    }

    public void InsertBefore(Node next_Node, int new_data) {
        // Check if the given next_node is NULL
        if (next_Node == null) {
            System.out.println(
                    "The given next node cannot be NULL ");
            return;
        }

        // 1. Allocate node
        // 2. Put in the data 
        Node new_node = new Node(new_data);

        // 3. Make previous of new node as previous of prev_node
        new_node.Prev = next_Node.Prev;

        // 4. Make the prev of next_node as new_node
        next_Node.Prev = new_node;

        // 5. Make next_node as next of new_node
        new_node.next = next_Node;

        // 6. Change next of new_node's previous node
        if (new_node.Prev != null) {
            new_node.Prev.next = new_node;
        } else {
            head = new_node;
        }
    }




    public void AddLast(T e) {   // O(1)
        Node<T> newNode = new Node<T>(e);
        if (head == null) {
            head = tail = newNode;
            newNode.Prev =null; 
            
        }else {
          tail.next =newNode; 
          newNode.Prev =tail; 
          newNode.next =null; 
          tail =newNode;
                 
            
        
         }
       size++; 
    }
    
    
    // Function to delete a node in a Doubly Linked List. 
    // head_ref --> pointer to head node pointer. 
    // del --> data of node to be deleted. 
    void deleteNode(Node del) 
    { 
  
        // Base case 
        if (head == null || del == null) { 
            return; 
        } 
  
        // If node to be deleted is head node 
        if (head == del) { 
            head = del.next; 
        } 
  
        // Change next only if node to be deleted 
        // is NOT the last node 
        if (del.next != null) { 
            del.next.Prev = del.Prev; 
        } 
  
        // Change prev only if node to be deleted 
        // is NOT the first node 
        if (del.Prev != null) { 
            del.Prev.next = del.next; 
        } 
  
        // Finally, free the memory occupied by del 
        return; 
    } 
    
    
    
    public int GetSize(){
      return size;   
        
    } 
    
    
    
    public T RemoveLast(){
      if(tail ==null){
       return null; 
      }
      T e = tail.data ; 
      tail =tail.Prev; 
      
      if(tail ==null){
      head =null; 
      }else {
      tail.next =null;
       }
      return e; 
    } 
    
     public T RemoveFirst(){
      if(head ==null){
       return null; 
      }
      T e = head.data ; 
      
      if(head.next !=null){
          
          head.next.Prev =null;
          head =head.next; 
          
       }
      
      
      
      
              
              
      return e; 
    } 
    
    
    
    public String ToString() {

        Node<T> curr = head;
        String str = "";
        while (curr != null) {
            str += curr.getData() + ",";
            curr = curr.next;
        }
        return str;
    }
    
       public boolean contains(T e) {
        Node<T> curr = head;
        boolean flag = false;
        while (curr != null) {
            if (curr.data.equals(e)) {
                flag = true;
                break;
            }
            curr = curr.next;
        }

        return flag;

    }
    
    
    
    
    public void Clear() {
        head = tail = null;
        size = 0;

    }
    
    public static void main(String[] args) {
            
        
        DoublyLinkedList<Integer> d = new DoublyLinkedList<>(); 
        d.AddLast(2);
        d.AddLast(4);
        d.AddLast(8);
        d.AddLast(10); 

        
        System.out.println(d.ToString());
//        d.deleteNode(d.head);
//        System.out.println(d.ToString());
//        d.deleteNode(d.head.next);
//        System.out.println(d.ToString());
        System.out.println(d.GetSize()); 
        System.out.println(d.contains(8));
//        System.out.println(d.RemoveFirst()); 
                

        
    }

}
