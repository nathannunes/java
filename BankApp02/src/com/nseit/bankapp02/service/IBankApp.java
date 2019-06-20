package com.nseit.bankapp02.service;

public interface IBankApp {
    int minBalance = 600;
    void withdraw(double amount);
    void deposit(double amount);
}
