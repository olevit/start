package com.company.MyOwnCode.User1;

import java.util.Scanner;

public class Ceasar1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a massage to encode or decode:");
        String  x = scan.nextLine();
        System.out.print("Please, enter a secret key (a positive encoding key or a negative decoding key): ");
        int key = Integer.parseInt(scan.nextLine());
        String x1 = "";
        for (int i = 0, n = x.length(); i < n; i++) {
            char s = x.charAt(i);
            if((s >= 'A' && s <= 'Z') || (s >= 'a' && s <= 'z')) {
                s += - s + 'A' + ('a'%'A') * (int)(s / 'a') + ('Z' % 'A') * ((int)('A' + ('a' % 'A') * (int)(s / 'a'))
                        / (s + key % 26)) + (int)(s - 'A' - ('a' % 'A') * (int)(s / 'a') - ('Z' % 'A') * ((int)('A' +
                            ('a' % 'A') * (int)(s / 'a')) / (s + key % 26)) + key % 26) % 26;
            }
            x1 += s;
        }
        System.out.println(x1);
    }
}
//This code is another one of my own problem solving
//Caesar's code. This code is also original because if statement is used only once. I made a formula for encoding and decoding. This formula seems complicated, but I was very interested in creating it. I created two different formulas in these programs: ()