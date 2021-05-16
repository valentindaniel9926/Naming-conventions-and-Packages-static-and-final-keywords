package com.company;

import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;

public class Main {

    public static void main(String[] args) {
	Account ValentinsAccount = new Account("Valentin");
	ValentinsAccount.deposit(1000);
	ValentinsAccount.withdrawal(500);
	ValentinsAccount.withdrawal(-200);
        ValentinsAccount.deposit(-20);
        ValentinsAccount.calculateBalance();
        ValentinsAccount.balance=5000;
        System.out.println("Balance on account is " + ValentinsAccount.getBalance());
        ValentinsAccount.transactions.add(4500);
        ValentinsAccount.calculateBalance();
    }
}
