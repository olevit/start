package com.company.Array;

public class Array {
    private int[] x;
    private int z;
    public Array(int y){
        x = new int[y];
    }
    public void insert (int x1){
        if (x.length == z){
            int[] newX = new int[z * 2];
            for(int i = 0; i < z; i++)
                newX[i] = x[i];
            x = newX;
        }
        x[z++] = x1;
    }
    public void removeAt(int x2){
        if(x2 < 0 || x2 >= z)
            throw new IllegalArgumentException();
        if (x.length == z) {
            int[] newX = new int[z + 1];
            for (int i = 0; i < z; i++)
                newX[i] = x[i];
            x = newX;
        }
        for (int i = x2; i < z; i++)
                x[i] = x[i + 1];// не працює, коли z = x.lenght, виходить за межі останнього
        z--;
    }
    public int indexOf(int x1) {
        for (int i = 0; i < z; i++)
            if (x[i] == x1)
                return i;
        return -1;
    }
    public void print(){
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
    }
}
