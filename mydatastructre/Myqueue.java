/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructre;

/**
 *
 * @author hp
 */
public interface Myqueue<E> {
    public abstract boolean add(E value) ; // add last , null 
    public abstract boolean offer(E value );//add last , false 
    public abstract E remove();//  delete first , excpetion
    public abstract E poll ();// delete first , null  
    public abstract E element (); // return first , exception 

    public abstract E peek(); // return first , null
    public abstract int size(); 
    public abstract boolean isempty(); 
   public abstract String ToString (); 
}
