package com.day4.session3;

import java.io.*;

class Account implements Serializable {
    private int id;
    private String balance;

    public Account(int id, String balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", balance='").append(balance).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
public class DemoSer {
    public static void main(String[] args)throws IOException{
        //Ser is a process to convert oject into a formate so that it can trasmit over network
        ObjectOutputStream oos=
                new ObjectOutputStream(new FileOutputStream(new File("demo.ser")));

        Account account=new Account(1,"3000.00");
        oos.writeObject(account);

        System.out.println("done");
    }
}
