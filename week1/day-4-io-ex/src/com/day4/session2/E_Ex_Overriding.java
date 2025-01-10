package com.day4.session2;
class AEx extends Exception{}
class BEx extends AEx{}

class A{
    void foo() throws AEx
    {
        System.out.println("foo of class A");
    }
}
class B extends  A{
    @Override
    void foo() throws BEx, RuntimeException
    {
        System.out.println("foo of class B");
    }
}
public class E_Ex_Overriding {
    public static void main(String[] args) {
        A a=new B();
        try {
            a.foo();
        } catch (AEx e) {
            System.out.println(e);
        }
    }
}
