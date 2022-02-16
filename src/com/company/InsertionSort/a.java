package com.company.InsertionSort;

public class a {
    public static void main(String args[]){
        int arr[] = {4,7,6,8};
        for(int i = 1, n = arr.length; i < n; ++i){
            System.out.println("q" + i);
            int key = arr[i];
            while (i - 1 >= 0 && arr [i - 1] > key){
                arr [i] = arr[i - 1];
                i = i - 1;
            }
            arr[i] = key;
            System.out.println(i + " " + key + " " + arr[i]);
        }
        for(int i = 0, n =arr.length;  i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
