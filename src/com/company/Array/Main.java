package com.company.Array;

public class Main {
    public static void main(String[] args) {
        Array v = new Array(4);
        v.insert(10);
        v.insert(20);
        v.insert(30);
        v.insert(40);
        v.removeAt(1);
        v.print();
        System.out.println(v.indexOf(40));
    }
}