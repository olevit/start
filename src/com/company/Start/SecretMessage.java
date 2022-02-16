package com.company.Start;

import java.util.Scanner;

public class SecretMessage {
    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a massage to encode or decode:");
        String x = scan.nextLine();
        String y = "";
        for (int i = x.length() - 1; i >= 0; i--)
            y += x.charAt(i);
        System.out.println(y);
    }
}
