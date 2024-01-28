package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    
    private double interestRate;
 
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
     
    public void applyInterest(){

    }

    public double getInterestRate(){
        return interestRate;
        
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;

    }
}
