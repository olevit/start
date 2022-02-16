package com.company.QuickSort;

public class Main {
    public static void main(String args[]){
        int arr[] = {10,7,8,9,1,5};
        QuickSort ob = new QuickSort();
        ob.sort(arr,0, arr.length - 1);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
