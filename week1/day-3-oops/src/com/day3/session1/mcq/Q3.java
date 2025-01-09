package com.day3.session1.mcq;
//instanceOf operator
interface M{

}
class Foo implements M{
    void foo(){
        System.out.println("foo method of class Foo");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Foo foo=null;
        if(foo instanceof Object){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
