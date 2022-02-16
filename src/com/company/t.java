package com.company;

import com.company.Array.Array;

import java.awt.*;
import java.util.Arrays;

public class t {
    public static void main(String[] args) {
        int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
        int max = mice[0];
        for(int i = 1; i < mice.length; i++){
            if(max < 25 & max < mice[i]){
                    max = mice[i];
            }
        }
        System.out.println(max);
    }
}











