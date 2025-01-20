package com.demo.ex_handing;
//What is the need of custom exception?
//XYZ bank: min bal for opening the acc :10K
//deposit: 15L
//withdrawing: 10L

//Checked Ex vs Unchecked Ex
class InsuffientFundException extends Exception{
    public InsuffientFundException(String message) {
        super(message);
    }
}
class OverFundException extends RuntimeException{
    public OverFundException(String message) {
        super(message);
    }
}
class Account{
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) throws InsuffientFundException{
        this.id = id;
        this.name = name;
        this.balance = balance;
        if(balance<10000){
            throw new InsuffientFundException("insuffient balance");
        }
    }
    public void deposit(int amount){
        double temp=balance+amount;
        if(temp>=15_000_00){
            throw new OverFundException("over fund");
        }
        balance=temp;
    }
    public void withdraw(int amount)throws InsuffientFundException{
        double temp=balance-amount;
        if(temp<10_000){
            throw new InsuffientFundException("not suffifient fund");
        }
        balance=temp;
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
}
public class C_CustomerEx {
    public static void main(String[] args) {
        Account account= null;
        try {
            account = new Account(1,"xyz",20000);
            account.deposit(1500_000);
            System.out.println(account);

        } catch (InsuffientFundException e) {
            System.out.println(e.getMessage());
        }catch (OverFundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------");
    }
}
