package Sorting;

import java.util.Arrays;

public class Sort {

    public static void SelectionSort(int[] arr) { // 4 5 6 2 1 3  O(n^2)

        for (int i = 0; i < arr.length - 1; i++) {

            int minindix = i; // i = 0 

            for (int j = i + 1; j < arr.length; j++) { // j = 3
                if (arr[minindix] > arr[j]) {  //       arr[0] > arr[3]

                    minindix = j; // minindex = 5 ;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minindix]; //3 5 6 2 1 4
            arr[minindix] = temp;

        }

    }

    public static void bubblesort(int arr[]) {  // O(n^2)  2 9 5 4 8 1

        for (int k = 1; k < arr.length; k++) {

            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }

            }

        }

    }

    /*
          85 12 59 54 72 51
          
     */
    public static void InsertionSort(int arr[]) { // 4 ,5, 6, 2, 1, 3  O(n^2)

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) { // j=1 

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }

        }
    }

    public static void MergSort(int arr[]) {  // O(nLogn )
        if (arr.length < 7) {
            InsertionSort(arr);
            return;
        }

        if (arr.length > 1) {
            int arrlift[] = new int[arr.length / 2];
            arrlift = Arrays.copyOfRange(arr, 0, arr.length / 2);
            MergSort(arrlift);

            int arrRight[] = new int[arr.length / 2];
            arrRight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
            MergSort(arrRight);
            merg(arrlift, arrRight, arr);

        }
    }

    public static void merg(int arrlift[], int arrRight[], int arr[]) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < arrlift.length && current2 < arrRight.length) {
            if (arrlift[current1] < arrRight[current2]) {
                arr[current3++] = arrlift[current1++];

            } else {
                arr[current3++] = arrRight[current2++];

            }

        }

        while (current1 < arrlift.length) {
            arr[current3++] = arrlift[current1++];

        }

        while (current2 < arrRight.length) {
            arr[current3++] = arrRight[current2++];

        }

    }


    
    
    // ** ********************************QuikSort 

       public static void QuickSort(int[] arr, int low, int high) {
        
         if(low >= high){
             return ;
       }  
        int middle = low +(high-low)/2; 
        int pivot =arr[middle]; 
        int i =low ; 
        int j =high ; 
        
        while(i <= j){
          while(arr[i] < pivot){
           i++; 
           }
          while(arr[j] > pivot){
           j--; 
           }
          if(i<= j){
              int temp = arr[i]; 
              arr[i] =arr[j]; 
              arr[j] =temp; 
              i++; 
              j--; 
           }
          
          
         }
        if(low < j ){
            QuickSort(arr, low, j);
         }
        if(high >i){
            QuickSort(arr, i, high);

         }

    }
    
    
   
    
    public static void QuickSort(int[] arr) {
        QuickSort(arr, 0, arr.length-1);
        
    }


    public static void main(String[] args) {

        int arr1[] = {5, 6, 2, 1, 3,2,1,7,34,90};
       
        QuickSort(arr1);
        System.out.println(Arrays.toString(arr1));

    }

}
