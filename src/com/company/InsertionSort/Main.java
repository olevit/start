package com.company.InsertionSort;

public class Main {
    public static void main(String args[]){
        int arr[] = {12, 11, 13, 0, 1, 5, 6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        ob.printArray(arr);
    }
}
