package com.company.SelectionSort;

public class Main {
    public static void main(String args[]){
        int arr[] = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        SelectionSort ob = new SelectionSort();
        ob.selectionSort(arr);
        System.out.println("After Selection Sort");
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
