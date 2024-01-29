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
        if (requested <= 0) {
            return 0; // return 0 for both negative and zero requested amount in account
        } else if (requested <= balance) {
            balance -= requested;
            return requested;
        } else {
            return 0; // Returns 0 for insufficient balance in account
        }

        }

        public String toString(){
           return String.format("Account no: %d Balance: £%.2f", accountNumber, balance); 
        }

      
    }

 

     

