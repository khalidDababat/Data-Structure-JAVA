package mydatastructre;

import BinaryTree.BST;
import Queue.MyQueueNode;
import Stack.MyStack;
import Stack.StackByLinkedlist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import sun.reflect.generics.tree.Tree;

public class MydataStructre {

    public static void main(String[] args) {

        BST<Integer> tree = new BST();
//        tree.insert(11);
//        tree.insert(6);
//        tree.insert(40);
//        tree.insert(9);
//        tree.insert(5);
 

      
          
       
  






//        System.out.println(list.remove(new Integer(10)));
    }
   
  
     
    public static ArrayList reverce(ArrayList list) {
        for (int i = 0; i < list.size() / 2; i++) {
            list.set(i, list.set(list.size() - 1 - i, list.get(i)));
        }
        return list;
    }

    public static Queue Find_Common_Items(Queue q1, Queue q2) {
        Queue<Integer> q3 = new LinkedList<>();
        while (!q1.isEmpty()) {
            int num = (int) q1.element();
            if (q2.contains(num)) {
                q3.add(num);
                q1.remove();
            } else {
                q1.remove();
            }

        }
        return q3;

    }

    public static ArrayList Duplicate(ArrayList x) {
        int count = x.size();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (x.get(i).equals(x.get(j))) {
                    x.remove(j--);
                    count--;

                }
            }
        }

        return x;
    }

    public static ArrayList Merge(ArrayList x, ArrayList y) {

        for (int i = 0, j = 0; j < y.size(); i++) {
            if (i == x.size() || (int) x.get(i) > (int) y.get(j)) {
                x.add(i, y.get(j++));
            }

        }
        return x;

    }

}
