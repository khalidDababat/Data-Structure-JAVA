package Sorting;

import java.util.Arrays;

public class HeapSort {

    public static int n;

    public static int left;
    public static int Right;
    public static int Largest;

    private static void heapify(int[] a, int n, int i) {
        Largest = i; // Largest as root      
        int Lift = 2 * i + 1;
        int Right = 2 * i + 2;

        // if lift Child is Larger than root  
        if (Lift < n && a[Lift] > a[Largest]) {
            Largest = Lift;
        }

        // if Right Child is Larger than root 
        if (Right < n && a[Right] > a[Largest]) {

            Largest = Right;
        }
        // if largest is not root 
        if (Largest != i) {
            int temp = a[i];
            a[i] = a[Largest];
            a[Largest] = temp;

            //Recursively heapify
            heapify(a, n, Largest);
        }

    }

    public static void HeapSort(int arr[]) {
        int n = arr.length;

        // build Max Heap 
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        int a[] = {3, 1, 5, 2, 7, 4};
        HeapSort(a);
        System.out.println(Arrays.toString(a));

    }

}
