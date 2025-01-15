package com.threads.session2.classical_threads;
class Account{
    private  int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public void print(){
        System.out.println(balance);
    }
}
class Husband implements Runnable{
    private Account account;

    public Husband(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++)
            account.deposit(1000);
    }
}
class Wife implements Runnable{
    private Account account;

    public Wife(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++)
            account.withdraw(1000);
    }
}
public class DemoBankApp {
    public static void main(String[] args) throws InterruptedException{
        Account account=new Account(1000);
        account.print();
        Husband husband=new Husband(account);
        Wife wife=new Wife(account);

        Thread t1=new Thread(husband);
        Thread t2=new Thread(wife);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        account.print();

    }
}
