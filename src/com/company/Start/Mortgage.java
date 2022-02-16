package com.company.Start;

import java.util.Scanner;
import java.text.NumberFormat;
public class Mortgage {
    public static void main(String[] args) {
        final byte MOTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        byte years = 0;
        int principal = 0;//enter int value outside cicle and works without "= 0"
        int numberOfPayments = 0;
        float monthyInterest = 0;
        Scanner scanner = new Scanner(System.in);
        while (principal < 1000 || principal > 1_000_000) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1_000_000.");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthyInterest = annualInterest / MOTH_IN_YEAR / PERCENT;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }
        do {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MOTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }
        while (1 > years || years > 30);
        double mortgage = principal * (monthyInterest * Math.pow(1 + monthyInterest, numberOfPayments)) /
                (Math.pow(1 + monthyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
