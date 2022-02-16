package com.company.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int x;
        private Node y;
        public Node(int x){
            this.x = x;
        }
    }
    private Node f;
    private Node l;
    public void addLast(int x1) {
        var node = new Node(x1);
        if (isEmpty())
            f = l = node;
        else {
            l.y = node;
            l = node;
        }
    }
     public void addFirst(int x1){
        var node = new Node(x1);
        if(isEmpty())
            f = l = node;
        else{
            node.y = f;
            f = node;
        }
     }
     private boolean isEmpty(){
        return f == null;
     }
     public int indexOf(int x1){
        int z = 0;
        var c = f;
        while(c != null){
            if(c.x == x1)
                return z;
            c = c.y;
            z++;
        }
        return -1;
     }
     public boolean contains (int x1){
        return indexOf(x1) != -1;
     }
     public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(f == l){
            f = l = null;
            return;
        }
        var s = f.y;
        f.y = null;
        f = s;
     }
     public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        if(f == l){
            f = l = null;
            return;
        }
        var p = getP(l);
        l = p;
        l.y = null;
     }
     private Node getP(Node node){
        var c = f;
        while (c != null){
            if(c.y == node)
                return c;
            c = c.y;
        }
        return null;
     }
}

