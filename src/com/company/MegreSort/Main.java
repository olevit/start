package com.company.MegreSort;

public class Main {
    public static void main(String args[]){
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        MergeSort ob = new MergeSort();
        ob.printArray(arr);
        ob.sort(arr,0, arr.length - 1);
        ob.printArray(arr);
    }
}
