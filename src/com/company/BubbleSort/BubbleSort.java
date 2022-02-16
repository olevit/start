package com.company.BubbleSort;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for (int i = 0, temp = 0, n = arr.length; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if (arr[j - 1] > arr [j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr [j];
                    arr [j] = temp;
                }
            }
        }
    }

    public static void main (String[] args){
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        for(int i = 0; i < arr.length; i++)
            System.out.print((arr[i] + " "));
    }
}
