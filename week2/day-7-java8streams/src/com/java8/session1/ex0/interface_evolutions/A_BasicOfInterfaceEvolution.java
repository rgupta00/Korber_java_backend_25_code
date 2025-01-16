package com.java8.session1.ex0.interface_evolutions;
/*
    Java 8 interface evolution
    diamond problem in interface
    functional interface

 */
//java 8: u can add default method
// u can add static method

//100% abstraction?
interface Foo{
    public static final int i=0;
    public  abstract void foo();

    public  default void fooDefault(){
        System.out.println("foo default method");
    }
    public static  void fooStatic(){
        System.out.println("foo stataic method");
    }
}
class FooImpl implements Foo{
    @Override
    public void foo(){
        System.out.println("foo method is overriden");
    }
    public void fooDefault(){
        System.out.println("foo default method is overriden");
    }
}
public class A_BasicOfInterfaceEvolution {
    public static void main(String[] args) {
        Foo foo=new FooImpl();
        foo.foo();
        foo.fooDefault();

        Foo.fooStatic();
    }
}
