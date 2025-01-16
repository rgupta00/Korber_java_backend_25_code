package com.java8.session1.ex0.interface_evolutions;

//me ---> 2 jr engg
interface Stack{
    public void push(int x);
    public int pop();

    public default  int peek(){
        System.out.println("logic related to default method");
        return 2;
    }
    public static void logic(){
        System.out.println("logic related to static method");
    }
}

//navneet
class StackImpl1 implements Stack{
    @Override
    public void push(int x) {
    }
    @Override
    public int pop() {
        return 0;
    }
}


//rashim
class StackImpl2 implements Stack{
    @Override
    public void push(int x) {
    }
    @Override
    public int pop() {
        return 0;
    }
    public  int peek(){
        System.out.println("logic related to default method overriden");
        return 20;
    }
}


public class A_Java8InterfaceImprovement{
    public static void main(String[] args) {

        Stack s=new StackImpl2();
        s.push(10);
        System.out.println(s.pop());
    }
}
