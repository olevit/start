package com.company.MyOwnCode.User1;

import java.util.Scanner;

public class Caesar {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a massage to encode or decode:");
        String  x = scan.nextLine();
        System.out.print("Please, enter a secret key (a positive encoding key or a negative decoding key): ");
        int key = Integer.parseInt(scan.nextLine());
        for (int i = 0, n = x.length(); i < n; i++) {
            char s = x.charAt(i);
            if((s >= 'A' && s <= 'Z') || (s >= 'a' && s <= 'z')) {
                s += key % 26 - 26 * ((int)(s - 'A' - ('a' % 'A') * (int) (s / 'a') - ('Z' % 'A') * (int)(('A' +
                        ('a' % 'A') * (int)(s / 'a')) / (s + key % 26)) + key % 26) / 26);
                System.out.print(s);
            }
            else{
                System.out.print(s);
            }
        }
    }
}
//This code is my own solution to the Coding of Caesar task. This code is original because "if" statement is used only once. I made a formula for encoding and decoding. This formula seems complicated, but creating it was very interesting to me. I made two different formulas in these programs: Caesar.java and Caesar1.java.
