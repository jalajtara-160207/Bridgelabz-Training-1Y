package com.gla.Level1Practice;

public class ATMain {
    public static void main(String[] args) {
        ATM account = new ATM("Jalaj Tara", "123456789", 1000.0);
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}
