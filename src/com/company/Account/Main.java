package com.company.Account;

public class Main {
    public static void main(String[] args){
        var account = new Account();
        account.deposit(10);
        account.withdraw(6);
        System.out.println(account.getBalance());
    }
}
