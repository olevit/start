package com.company.BinarySearch;

public class BinarySearch {
    int binarySrearch(int arr[], int l, int r, int x){
        if(r >= l){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] > x)
                return binarySrearch(arr, l, mid - 1, x);
            return binarySrearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
