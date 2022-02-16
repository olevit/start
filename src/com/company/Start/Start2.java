package com.company.Start;

import java.util.Scanner;

public class Start2 {
    public static void main(String[] args) {
        int x = 32;
        if (x > 30)
            System.out.println("Hot");
        else if (x > 20)
            System.out.println("nice");
        else
            System.out.println("Cold");
        x = 120_000;
        String s = x > 100_000 ? "First" : "Economy";
        System.out.println(s);
        s = "a";
        switch (s) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
            default:
                System.out.println("C");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int x1 = scanner.nextInt();
        if (x1 % 5 == 0 && x1 % 3 == 0)
            System.out.println("AB");
        else if (x1 % 5 == 0)
            System.out.println("A");
        else if (x1 % 3 == 0)
            System.out.println("B");
        else
            System.out.println("C");
        s = "";
        while(!s.equals("quit")){
            System.out.print("Input: ");
            s = scanner.next().toLowerCase();
            System.out.println(s);
        }
        do {
            System.out.print("Input: ");
            s = scanner.next().toLowerCase();
            System.out.println(s);
        }while (!s.equals("quit"));
        s = "";
        while (!s.equals("quit")){
            System.out.print("Input: ");
            s = scanner.next().toLowerCase();
            if (!s.equals("quit"))
                System.out.println(s);
        }
        s = "";
        while (!s.equals("quit")){
            System.out.print("Input: ");
            s = scanner.next().toLowerCase();
            if (s.equals("quit"))
                break;
            System.out.println(s);
        }
        s = "";
        while (!s.equals("quit")){
            System.out.print("Input: ");
            s = scanner.next().toLowerCase();
            if (s.equals("pass"))
                continue;
            if (s.equals("quit"))
                break;
            System.out.println(s);
        }
        String [] y = {"A","B","C"};
        for (int i = 0; i < y.length; i++)
            System.out.println(y[i]);
        for (String i1 : y)
            System.out.println(i1);
        for(int i = y.length - 1; i >= 0; i--)
            System.out.println(y[i]);
        int c = 0;
        while (true){
            System.out.print("c: ");
            c = scanner.nextInt();
            if (c >= 1000 && c <= 1000_000)
                break;
            System.out.println("Enter between 1000 and 10000000: ");
        }
    }
}
