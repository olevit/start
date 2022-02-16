package com.company.Start;

import java.util.Scanner;

public class My {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a massage to encode or decode:");
        String  x = scan.nextLine();
        System.out.println("Please, enter a secret key.\nA positive encoding key or a negative decoding key:");
        int k = Integer.parseInt(scan.nextLine());
        for (int i = 0, n = x.length(); i < n; i++) {
            char x1 = x.charAt(i);
            if((x1 >= 'A' && x1 <= 'Z') || (x1 >= 'a' && x1 <= 'z')) {
                x1 += k % 26 - 26 * (int)((x1 - 'A' - ('a' % 'A') *
                        (int) (x1 / 'a') - ('Z' % 'A') * (int)(('A' +
                            ('a' % 'A') * (int)(x1 / 'a')) / (x1 + k % 26))
                                + k % 26) / 26);
                System.out.print(x1);
            }
            else
                System.out.print(x1);
        }
    }
}
