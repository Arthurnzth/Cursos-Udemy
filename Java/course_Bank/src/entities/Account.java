package Udemy.Java.course_Bank.src.entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account(int accountNumber, String accountHolder, double initialDepositValue) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositValue(initialDepositValue);
    }
    public Account(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    public Account(){
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public double initialDepositValue(double initialDepositValue){
        return accountBalance += initialDepositValue;
    }
    public void depositValue(double depositValue){
        this.accountBalance += depositValue;
    }
    public void withdrawValue(double withdrawValue){
        this.accountBalance -= (withdrawValue + 5);
    }
    public String toString(){
        return ("Account " 
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", accountBalance));
    }
}