package com.company.Start;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SecretMassage1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a massage to encode or decode:");
        String x = scan.nextLine();
        String y ="";
        System.out.println("Enter a secret key (-25 to 25):");
        int z = Integer.parseInt(scan.nextLine());
        char k = (char)z;
        for (int i = 0; i < x.length(); i++){
            char a = x.charAt(i);
            if (a >= 'A' && a <= 'Z') {
                a += k;
                if (a > 'Z')
                    a -= 26;
                if (a < 'A')
                    a += 26;
            }
            else if (a >='a' && a < 'z')
            {
                a += k;
                if(a > 'z')
                    a -= 26;
                if(a < 'a')
                    a += 26;
            }
            else if(a >= '0' && a <= '9') {
                a += (z % 10);
                if (a > '9')
                    a -= 10;
                if (a < '0')
                    a += 10;
            }
            y += a;
        }
        System.out.println(y);
        scan.close();
    }
}
