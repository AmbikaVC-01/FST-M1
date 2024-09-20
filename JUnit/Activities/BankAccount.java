package com.example.fst_m1_junit01;

public class BankAccount {
    private Integer balance;
    
    // Create a constructor
    public BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}