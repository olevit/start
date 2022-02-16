package com.company.Start;

import javax.swing.*;
import java.util.Scanner;

public class Hilo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = "";
        do {
            int x = (int)Math.random() * 10 +1;
            int y = 0;
            int z = 0;
            while (y!=x) {
                System.out.print("Guess a number between 1 and 10: ");
                y = scan.nextInt();
                if (y < x)
                    System.out.println(y + " is too lower. Try again!");
                else if (y > x)
                    System.out.println(y + " is too high. Try again!");
                else
                    System.out.println(y + " is correct. You win!!!");
                z++;
            }
            System.out.println("You have used " + z + " attempts.");
            System.out.println("Would you like to play again (y/n)? ");
            s = scan.next();
        }
        while(s.equalsIgnoreCase("y"));
        System.out.println("Thank for you playing! Goodbuy!");
        scan.close();
    }
}
