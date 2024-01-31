package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
     public double getOverdraftLimit(){
        return overdraftLimit;
     }
      
     public void setOverdraftLimit(double overdraftLimit){
      this.overdraftLimit = overdraftLimit;
     }
     @Override
public double withdraw(double requested) {
    double availableBalance = getBalance() + overdraftLimit;
    if (requested <= availableBalance) {
        return super.withdraw(requested);
      } else {
        if (requested <= overdraftLimit) {
            double actualMoney = super.withdraw(requested);
            return actualMoney;   
        } else {
            return 0.0;
        }
      }
    }
}
    

     
    
   

