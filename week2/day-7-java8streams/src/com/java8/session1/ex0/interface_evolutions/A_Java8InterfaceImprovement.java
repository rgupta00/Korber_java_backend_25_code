package com.java8.session1.ex0.interface_evolutions;

//me java 7
interface Stack{
    public void push(int x);
    public int pop();
    
    public default  int peek() {
    	System.out.println("it is a default method of Stack interface");
    	return -1;
    }
    public static  void fooStatic() {
    	System.out.println("it is static method");
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
    public   int peek() {
    	System.out.println("it is a default method overriden of Stack interface");
    	return -22;
    }

}


public class A_Java8InterfaceImprovement{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
