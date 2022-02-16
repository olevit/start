package com.company.LinkedList;

public class Main {
    public static void main(String[] args){
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(70);
        list.addLast(80);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(70));
        System.out.println(list.contains(40));
        System.out.println(list.contains(30));
    }
}
