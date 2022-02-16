package com.company.BinarySearch1;

public class Main{
    public static void main(String[] args){
        BinarySearch1 ob = new BinarySearch1();
        int arr[] = {2,3,4,10,40};
        int result = ob.binarySearch(arr, 0, arr.length - 1, 10);
        if(result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
