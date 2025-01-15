package com.anno_tut;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//SAM: single abstract method: java 8 streams*
@FunctionalInterface
interface Foo{
    public void foo();

}

class A{
    void m1(){
        System.out.println("m1");
    }
    @Deprecated
    @SuppressWarnings({"rawtypes","unchecked"})
    void oldLogic(){
        List l=new LinkedList();
        l.add("foo");
        System.out.println(l);
        System.out.println("old logic 2005 but not optimal");
    }
    void newLogic(){
        System.out.println("old logic 2024 but optimal");
    }
}
class B extends  A{
    @Override
    void m1(){
        System.out.println("m1 override");
    }
}
public class DemoAnno {
    public static void main(String[] args) {

        A a=new A();
        a.oldLogic();
    }
}
