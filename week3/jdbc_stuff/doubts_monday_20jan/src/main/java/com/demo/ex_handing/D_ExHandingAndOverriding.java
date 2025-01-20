//package com.demo.ex_handing;
//
//import java.io.IOException;
//
////IOException Exception
//class A{
//    A() throws IOException{
//        System.out.println("ctr of class A");
//    }
//    void foo() throws Exception {
//        System.out.println("foo method of class A");
//    }
//}
//class B extends A{
//    //ctr of drive class can not throw "smaller ex"
//    B()throws Exception{
//        System.out.println("ctr of class B");
//    }
//
//
//    //overriden method can not throw "bigger ex"
//    void foo() throws IOException{
//        System.out.println("foo method of class B: overriding");
//    }
//}
//public class D_ExHandingAndOverriding {
//    public static void main(String[] args) {
//    A a=new B();
//    a.foo();
//    }
//}
