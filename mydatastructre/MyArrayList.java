package mydatastructre;

import java.util.ArrayList;

public class MyArrayList<T> {

    private int size;
    private Object arr[];
    private final int capacity;

    public MyArrayList() {
        size = 0;
        capacity = 5;
        arr = new Object[capacity];

    }

    public void ensurecapcity() {
        int newSize = arr.length * 2;
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < arr.length; i++) { // O(n )
            newArray[i] = arr[i];
        }
        arr = newArray;

    }

    public void add(T e) { // o(1) constant 
        if (arr.length == size) {
            ensurecapcity(); // O(N) Linear 
        }
        arr[size] = e;
        size++;
//        arr[size++] =e;
    }

    public int getsize() {
        return size;
    }

    public T set(T element, int index) {   // O(1) Time constant 

        if (index < 0 || index > getsize()) {
            throw new IndexOutOfBoundsException(" size " + size + " index " + index);
        }
        T oldelement = (T) arr[index];
        arr[index] = element;
        return oldelement;
    }

    public T get(int i) {  // o(1) not lenear
        if (i < 0 || i > getsize()) {
            throw new IndexOutOfBoundsException("Size " + size + "index " + i);

        } else {
            return (T) arr[i];
        }

    }

    public boolean Isempty() {  // Time Complexity O(1) constant 
        return size == 0;

    }

    public void addbyindex(T e, int index) {  //  O(n)
        if (index < 0 || index > getsize()) {
            throw new IndexOutOfBoundsException("Size " + size + "index " + index);
        } else if (size == index) {
            add(e);
        } else {
            for (int i = getsize(); i >= index; i--) { // O(n)

                arr[i + 1] = arr[i];
            }
            arr[index] = e;
            size++;
        }

    }

    public void Clear() { //O(1)
        arr = new Object[capacity]; // [null,null,null,....]
        size = 0;
    }

    public T removeByIndex(int index) { //O(n)
        T element = (T) arr[index];
        if (index < 0 || index > getsize()) {
            throw new IndexOutOfBoundsException("Size " + size + "index " + index);
        } else {

            for (int i = index; i <= getsize() - 1; i++) {
                arr[i] = arr[i + 1];
            }

            size--;
        }
        return element;
    }

    public T deletelast() {
        T element = (T) arr[size - 1];
        removeByIndex(size - 1);

        return element;
    }

    public void removelast() {
        size--;
    }

    public int indexOf(T e) { // O(n)
        int index = -1;

        for (int i = 0; i < getsize(); i++) {
            if (arr[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean contains(T e) { // O(n)
        boolean flag = false;
        for (int i = 0; i < getsize(); i++) {
            if (arr[i].equals(e)) {
                flag = true;
            }
        }
        return flag;
    }

    public boolean delete(T e) {
        if (!contains(e)) {
            return false;
        }
        removeByIndex(indexOf(e));
        return true;

    }

    // return index for last elment  this 
    public int lastindexOf(T e) {//o(n)

        int index = -1;
        for (int i = getsize() - 1; i >= 0; i--) {
            if (arr[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;

    }

    public String toString() {
        String str = "[ ";
        for (int i = 0; i < getsize(); i++) {
            str += arr[i] + ",";
        }
        return str + " ]";
    }

    public T deleteFirst() {
        T element = get(0);
        return removeByIndex(0);

    }

    public void rotateToright(Integer n) {
        for (int i = 0; i < n; i++) {
            T e = deleteFirst();
            add(e);
        }

    }

    //هل جميع قيم y exists in X  not in Order 
    public boolean containsAll(MyArrayList<T> list) {
        boolean flag = false;
        int count = 0;

        for (int i = 0; i < list.getsize(); i++) {  /// MyArrayList 
            for (int j = 0; j < size; j++) { // arr 
                if (list.get(i).equals(this.get(j))) {
                    count++;
                    break;
                }
            }
        }
        if (count == list.getsize()) {

            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }

    // In order 
    public boolean eqals(MyArrayList<T> s) {
        boolean flag = false;
        if (this.getsize() == s.getsize()) {
            for (int i = 0; i < getsize(); i++) {
                flag = true;
                if (this.get(i).equals(s.get(i))) {
                    flag = false;
                    break;
                }
            }

        }
        return flag;
    }

    public MyArrayList<T> Sublist(int index1, int index2) {
        int mid = (index2 - index1);
        MyArrayList<T> temp = new MyArrayList<T>();
        for (int i = 0, j = index1; i < mid; i++, j++) {
            temp.add((T) this.arr[j]);
        }
        return temp;
    }

    /*
     MyArrayList a    
    a.returnAll(MyArraylist list )
     //  this reference to itself Object in this Class l My ArrayList 
     */
    public boolean returnAll(MyArrayList<T> list) {
        boolean flag = false;
        if (list.size == 0) {
            flag = false;
        }

        for (int i = 0; i < list.getsize(); i++) {
            if (this.contains(list.get(i))) {
                flag = true;
                System.out.print(list.get(i) + " ");
            }
        }
        return flag;
    }

    public boolean AddAll(MyArrayList<T> list) {
        boolean flag = true;
        int newsize = this.size + list.size;

        if (list == null) {
            flag = false;
        } else {
            if (size == arr.length) {
                ensurecapcity();
            }

            int j = 0;
            for (int i = size; i < newsize; i++, j++) {
                arr[i] = list.get(j);
            }
        }
        return flag;
    }

    public void rotate(MyArrayList<T> list, int k) { // Rotate Left 

        if (k < 0) {
            System.out.println("the k moust Positive number ");
            return;
        } else {

            for (int i = 1; i <= k; i++) {
                list.addbyindex(deletelast(), 0);

            }

        }

    }

    public MyArrayList reverce(MyArrayList<T> list) {

        for (int i = 0; i < list.getsize(); i++) { // O(n)
            list.addbyindex(list.removeByIndex(list.size - 1), i);

        }
        return list;
    }

    // parameter must reverce Array From Quastion  As String Parameter 
    public MyArrayList reverceLitters(MyArrayList x) {
        MyArrayList<String> y = new MyArrayList<>();

        for (int i = 0; i < x.getsize(); i++) {
            String str = (String) x.get(i), ss = " ";
            for (int j = str.length() - 1; j >= 0; j--) {
                ss += str.charAt(j);
            }
            y.add(ss);

        }
        return y;

    }

    // 10 20 30  20 
    public static ArrayList Duplicate(ArrayList x) {
        int count = x.size();  // 
        for (int i = 0; i < count; i++) { // 0 ....> 5 
            for (int j = i + 1; j < count; j++) { //j=3 
                if (x.get(i).equals(x.get(j))) {
                    x.remove(j--);
                    count--;

                }
            }
        }

        return x;
    }

    public static ArrayList AddStars(ArrayList x) {

        for (int i = 0; i < x.size(); i++) {
            if (i % 2 != 0) {
                x.add(i, "*");
            }
        }
        return x;
    }

    public static Integer removelastelemnt(ArrayList<Integer> list) {
        //int element = list.get(list.size()-1 ) ;
        // return (Integer) list.remove(list.size()-1); 

        if (list.isEmpty()) {
            return 0;
        }
        int e = list.remove((Integer) list.size() - 1);
        int lastE = removelastelemnt(list);
        list.add(e);

        return e;

    }

    public static ArrayList RemoveStars(ArrayList x) {

        for (int i = 0; i < x.size(); i++) {
            if (x.contains("*")) {
                x.remove("*");
            }
        }
        return x;
    }

    public static ArrayList removePlurals(ArrayList<String> x) {

        for (int i = 0; i < x.size(); i++) {
            String str = x.get(i);
            if (str.endsWith("s")) {
                x.remove(str);
            }

        }
        return x;

    }

    public static boolean IsBalndrom(ArrayList x) {
        int High = x.size() - 1;
        int low = 0;

        while (low < High) {
            if (!(x.get(low++).equals(x.get(High--)))) {
                return false;
            }

        }

        return true;

    }

    public static ArrayList Merge(ArrayList x, ArrayList y) {

        for (int i = 0, j = 0; j < y.size(); i++) {
            if (i == x.size() || (int) x.get(i) > (int) y.get(j)) {
                x.add(i, y.get(j++));
            }

        }
        return x;

    }

    public static ArrayList reverce(ArrayList list) {
        for (int i = 0; i < list.size() / 2; i++) {
            list.set(i, list.set(list.size() - 1 - i, list.get(i)));
        }
        return list;
    }

}
