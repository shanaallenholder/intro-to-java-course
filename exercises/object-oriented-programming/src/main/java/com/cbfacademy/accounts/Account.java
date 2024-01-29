package com.cbfacademy.accounts;

public class Account {
  
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance){
         this.accountNumber = accountNumber;
         this.balance = balance;
   
    }
    
    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double requested) {
        if (requested <= balance) {
            balance -= requested;
            return requested;
        } else {
            return 0; 
        }
    }
}
 

     
