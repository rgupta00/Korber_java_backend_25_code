package com.day4.session2;
class XEx extends Exception{}
class YEx extends XEx{}

class X{
   X()throws XEx
   {
       System.out.println("ctr class X");
   }
}
class Y extends  X{
    Y() throws Exception
    {
        System.out.println("ctr class Y");
    }
}
public class F_Ex_Ctr {
    public static void main(String[] args) {

    }
}
