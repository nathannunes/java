package com.nseit.bankapp03.service;

public interface IBankApp {
    int minbalace = 1000;
    void withdraw(double amount);
    void deposit(double amount);
}
