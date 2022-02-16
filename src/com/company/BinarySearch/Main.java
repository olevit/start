package com.company.BinarySearch;

public class Main {
    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,5,6,7,10};
        int result = ob.binarySrearch(arr, 0,arr.length - 1, 10);
        if(result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
