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
 /*This account doesn't have an overdraft facility.
The balance of an account may only be modified through the deposit() and withdraw() methods.
Consider the necessary instance variables and the appropriate access modifiers to allow any sub-classes to access those values
  * 
 */
    public double withdraw(double requested) {
        if (requested <= balance) {
            balance -= requested;
            return requested;
        } else {
            return 0; // Insufficient balance
        }
    }
}
 

     

