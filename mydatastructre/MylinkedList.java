package mydatastructre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MylinkedList<T> implements Myqueue<T> {

    private Node<T> head, till;
    private int size = 0;

    public MylinkedList(T Object[]) {
        for (int i = 0; i < Object.length; i++) {
            addlast(Object[i]);
        }

    }

    public MylinkedList() {

    }

    public void addlast(T element) {
        Node<T> newNode = new Node<T>(element);
        if (head == null) {
            head = till = newNode;
        } else {
            till.setNext(newNode);
            till = newNode;
        }
        size++;

    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<T>(element);
        if (head == null) {
            head = till = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;

        }
        size++;
    }

    public int getSize() {
        return size;

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    public T getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.data;
        }

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

    public T getLast() {
        if (size == 0) {
            return null;
        } else {
            return till.data;
        }

    }

    public T removeLast() {

        if (size == 0) {
            return null;
        } else if (size == 1) {
            T e = till.data;
            head = till = null;
            size--;
            return e;
        } else {
            Node<T> curr = head;
            for (int i = 0; i < size - 2; i++) {
                curr = curr.next;
            }
            T e = till.data;
            till = curr;
            till.next = null;
            size--;
            return e;
        }

    }

    public T removeFirst() {
        if (head ==null) {
            return null;
        } else if (size == 1) {
            T e = till.data;
            head = till = null;
            size--;
            return e;

        } else {
            T e = head.data;
            head = head.next;
            size--;

            if (head == null) {
                till = null;
            }
            return e;
        }
    }

    

    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("size " + size + "index " + index);
        } else if (size == 1 || index == 0) {
            addFirst(e);
        } else if (size == index) {
            addlast(e);
        } else {
            Node<T> newnode = new Node<T>(e);
            Node<T> curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newnode.next = curr.next;
            curr.next = newnode;
            size++;

        }

    }

    public void rotateToright() {
        add(0, removeLast());
    }
 public void rotateToLift() {  // O(n)
        add(size-1, removeFirst());
    } 
 
 
    public void Clear() {
        head = till = null;
        size = 0;

    }

    public T midle() { // time complexity of O(n) and a space complexity of O(1)
        if (head == null) { // if linked list is empty return null 
            return null;
        }

        Node<T> slow = head;
        Node<T> fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow.data;
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

    public boolean search(Node<T> node, T e) {
        if (node == null) {
            return false;
        }
        if (node.data.equals(e)) {
            return true;
        } else {
            return search(node.next, e);
        }

    }

    public boolean search(T e) {

        return search(head, e);
    }

    public T getindex(int index) {
        if (index >= 0 && index < size) {

            Node<T> curr = head;
            int i = 0;
            while (curr != null) {
                if (index == i) {
                    return curr.data;
                }
                curr = curr.next;
                i++;

            }

        }
        return null;
    }
     
    
    
    
    
    
    public int indixof(T e) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.equals(e)) {
                return i;
            }
            current = current.next;
        }

        return -1;
    }

    public T set(int index, T e) {

        Node<T> temp = head;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("size " + size + "index " + index);
        }

        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        T value = temp.data;
        temp.data = e;

        return value;
    }

    // as a recarsive  
    public int getSize(Node<T> node) {
        if (node == null) {
            return 0;
        } else {

            return 1 + getSize(node.next);
        }

    }
    
    
    
  
     
    

    public void removebyindix(int indix) {
        if (indix < 0 || indix > size) {
            throw new IndexOutOfBoundsException("size " + size + "index " + indix);
        }
        if (indix == 0) {
            head = head.next;
        } else if (indix == size - 1) {
            Node<T> current = head;
            int i = 0;
            while (i != indix && current != null) {
                if (i == indix - 1) {
                    till = current;
                    current.setNext(null);// current = current .next =null 
                }
                i++;
                current = current.next;
            }

        } else {
            Node<T> current = head;
            int i = 0;
            while (i != indix && current != null) {
                if (i == indix - 1) {
                    current.setNext(current.getNext().getNext());
                }

                i++;
                current = current.getNext();

            }

        }
        size--;
    }

    public void deleteFirst() {

        removebyindix(0);
    }

    public void deleteLast() {

        removebyindix(size - 1);
    }

    public void deleteValue(T e) {
        int r = indixof(e);
        if (r != -1) {
            removebyindix(r);
        } else {
            System.out.println("the value not found  ");
        }

    }

    public Node<T> getNode(int index) {

        int i = 0;
        Node<T> current = head;
        while (current != null) {

            if (i == index) {
                return current;
            }
            current = current.next;
            i++;
        }
        return null;
    }

    public void swapbetweentownode(int x, int y) {

        if (x < 0 && y < 0 && y > size && x > size) {
            throw new IndexOutOfBoundsException("size " + size + "index " + x + " " + y);
        }

        Node<T> currX = getNode(x);
        Node<T> currY = getNode(y);
        Node<T> prevX = getNode(x - 1);
        Node<T> prevY = getNode(y - 1);

        if (prevX != null) {
            prevX.setNext(currY);
        } else {
            head = currY;

        }

        if (prevY != null) {
            prevY.setNext(currX);
        } else {
            head = currX;
        }

        Node<T> temp = currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(temp);

        if (till == currY) {
            till = currX;
        } else if (till == currX) {
            till = currY;
        }

    }

    public void SwapByvalue(T value1, T value2) {
        int index1 = indixof(value1);
        int index2 = indixof(value2);
        if (index1 != -1 && index2 != -1) {
            swapbetweentownode(index1, index2);
        }

    }

    public void find(MylinkedList<Integer> list) {
        Node<Integer> curr = list.head;
        Integer max = curr.data;
        Integer secoundMax = curr.data;
        for (int i = 0; i < list.getSize(); i++) {
            if (max < list.getindex(i)) {
                max = list.getindex(i);
            }
        }

        for (int i = 0; i < list.getSize(); i++) {
            if (secoundMax < list.getindex(i) && list.getindex(i) != max) {
                secoundMax = list.getindex(i);
            }

        }

        System.out.println("the max value un the Linked list " + max);
        System.out.println("the Secound max value un the Linked list " + secoundMax);

    }

    
     public void RemoveByValue(T e ){
       
         int index = indixof(e); 
         removebyindix(index);
      }
    public void removeAll(ArrayList list) { // Array list [1,2,3,4] ...> Linked list [3,4,1]

        if(head ==null ||till ==null ||list.isEmpty() ){
         return; 
         }
        Node<T> curr = head; 
        Node<T> prev =null;
        while(curr!=null){
             if(list.contains(curr.data)){
               if(prev ==null){
                 head = curr.next; 
                
             }else {
                prev.next = curr.next;
             } 
               
         }else {
               prev =curr;   
                 
             }
         curr=curr.next;
    }
    }
    
    
    public int  GetMin(MylinkedList l ){ // Get Minmum  O(n)
             if(head ==null){
              return -1; 
              }
             Integer  min = (Integer)head.data; 
             Node curr = head; 
             while(curr!= null){
              if((int)curr.data < min){
                 min = (Integer)curr.data;  
                    
              }
                 curr =curr.next; 
                 
             }
        return min; 
    } 
    
    
    
    public void reverse(Node curr){
       if(curr ==null){
       return ; 
       }
       reverse(curr.next); 
       System.out.print(curr.data+ " ");
       
       
        
        
        
    } 
    
    
    public  void minmum(){
       int Fmin = Integer.MAX_VALUE;
       int Smin = Integer.MAX_VALUE;
       int Thmin = Integer.MAX_VALUE;
      Node<Integer>temp = (Node<Integer>) head;
       while (temp!=null) {
           if(temp.data <Fmin){
               Thmin=Smin;
               Smin= Fmin;
               Fmin=temp.data;
             
           }
           else if(temp.data<Smin){
               Thmin=Smin;
               Smin=temp.data;
           }
           else if(temp.data<Thmin){
               Thmin = temp.data;
           }
           temp = temp.getNext();
           
       }
       System.out.println("First min "+Fmin);
     
       
        }
    
    public void reverse(){
          reverse(head); 
    } 
    
    
    public void revarselinckedlist() {

        if (head == null) {
            return;
        }

        Node<T> prev = null;
        Node<T> curr = head;
        Node<T> next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;

    }
    
    public T ValueAtNNodeFromLast (int n){
      
         Node<T> F1 = head; 
         Node<T> F2 = head; 
         
         for (int i = 0; i <n; i++) {
            F1 =F1.next; 
        }
         while(F1!=null){
              
             
             F2 =F2.next; 
             F1 =F1.next; 
             
          }
         
        return F2.data; 
         
     }
    
    public void pairSwap(){
            
         Node<T> curr = head; 
         
         while(curr!= null){  //  1->2->3->4->5->6->null  
            if(curr.next!=null){
                  T e =curr.data ;
                  curr.data =curr.next.data; 
                  curr.next.data =e ;
             }
            curr =curr.next.next; 
         
          }
    
     }
    
 

    
    // implimintation Queu by Linked list 
    //****************************************************
    @Override
    public boolean add(T value) {

        Node<T> newNode = new Node(value);
        if (head == null) {
            head = till = newNode;
            size++;
        } else {
            till.next =newNode; 
            till = newNode ; 
            
            size++;
        }
        return true;

    }

    @Override
    public boolean offer(T value) {

       try {
            Node<T> newnode = new Node<>(value);
            if (head == null) {
                head = till = newnode;
                size++;
            } else {
                till.next = newnode;
                till = newnode;
                size++;

            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public T remove() {
 if (head == null) {

            throw new UnsupportedOperationException("quee is empty "); //To change body of generated methods, choose Tools | Templates.
        } else {
            T e = head.data;

            Node<T> curr = head;
            head = head.next;
            curr.next = null;
            size--;
            return e;
        }    }

    @Override
    public T poll() {
        if (head == null) {

            return null;
        } else {
            T e = head.data;
            head = head.next;
            size--;
            return e;
        }


    }

    @Override
    public T element() {
  if (head == null) {

            throw new UnsupportedOperationException("quee is empty "); //To change body of generated methods, choose Tools | Templates.
        } else {
            return head.data;
        }



    }

    @Override
    public T peek() {

        if(head == null ){
         return null ; 
         }else {
        return head.data;  
         
         }



    }

    @Override
    public int size() {
        return size;

    }

    @Override
    public boolean isempty() {
         return  size ==0 ; 

    }
//*******************************************************************************
    
    
 
}
