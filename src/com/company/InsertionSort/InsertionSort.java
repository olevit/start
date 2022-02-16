package com.company.InsertionSort;

public class InsertionSort {
    void sort(int arr[]){
        for(int i = 1, n = arr.length; i < n; ++i){
            int key = arr[i];
            while (i - 1 >= 0 && arr [i - 1] > key){
                arr [i] = arr[i - 1];
                i = i - 1;
            }
            arr[i] = key;
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
