package com.company;

import com.company.Array.Array;

import java.util.Arrays;


public class s {
    public static void main(String args[]) {
        for(int i = 0; i < 2; i++)
            System.out.print(" ");
        for (int i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for(int a = 0; a < 1; a++)
                System.out.print(i + "|" );
            for (int j = 0; j < 10; j++)
                System.out.print(" ");
            for(int a = 0; a < 1; a++)
                System.out.print("|"+ i );
            System.out.println();
        }
        for(int i = 0; i < 2; i++)
            System.out.print(" ");
        for (int i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();
    }
}
