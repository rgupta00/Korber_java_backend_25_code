package com.day4.session2;
//how to create user define ex
//Account application, withdraw, deposit, create account
/*
    min bal for creating acc : 1000
    max dep at any time : 1L
    when u withdaraw agin: 1000
 */
class NotSufficientFundException extends RuntimeException{
    public NotSufficientFundException(String message) {
        super(message);
    }
}
class OverFundException extends RuntimeException{
    public OverFundException(String message) {
        super(message);
    }
}
class InvalidBalaceException extends RuntimeException{
    public InvalidBalaceException(String message) {
        super(message);
    }
}

class Account{
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        if(balance<1000){
            throw new InvalidBalaceException("insufficient balance "+ balance);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
    //3000
    public void withdraw(int amount){
        double temp=balance-amount;
        if(temp<1000){
            throw new NotSufficientFundException("insufficient balance "+ balance);
        }else {
            balance=temp;
        }
    }
    ///3000+1000000
    public void deposit(int amount){
        double temp=balance+amount;
        if(temp>1_00_000){
            throw new OverFundException("pls open current account "+ balance);
        }else {
            balance=temp;
        }
    }
}
public class D_UserDefineEx {
    public static void main(String[] args) {
        Account account= null;
        try {
            account = new Account(1,"nitin",3000.0);
            System.out.println(account);
        } catch (InvalidBalaceException e) {
            System.out.println(e.getMessage());
        }


    }
}
