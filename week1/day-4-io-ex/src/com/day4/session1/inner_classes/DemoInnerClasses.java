package com.day4.session1.inner_classes;
// top level inner class
//object of inner class can not be create without the valid object of outer class
class Outer{
    class Inner{
        void foo(){
            System.out.println("foo method of inner class");
        }
    }
    public   void myFoo(){
        Inner inner=new Inner();
        inner.foo();
    }
}
public class DemoInnerClasses {
    public static void main(String[] args) {
        Outer.Inner in= new Outer().new Inner();
        in.foo();
    }
}
