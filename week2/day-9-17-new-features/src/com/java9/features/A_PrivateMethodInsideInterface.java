package com.java9.features;
//private method inside an interface

interface Foo{
    void foo1();
    
    default void fooX(){
        myMethod();
    }
    default void fooY(){
        myMethod();
    }
    private void myMethod(){
        System.out.println("common code");
    }
    static  void foo2(){

    }
}
//interface Foof{
//}
 interface Java8DBLogging
{
    default void logInfo(String message)
    {
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Setp2: Log Info Message");
        System.out.println("Setp3: Close the DataBase connection");
    }

    default void logWarn(String message)
    {
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Setp2: Log warn Message");
        System.out.println("Setp3: Close the DataBase connection");
    }

    default void logError(String message)
    {
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Setp2: Log error Message");
        System.out.println("Setp3: Close the DataBase connection");
    }

}

public class A_PrivateMethodInsideInterface {
    public static void main(String[] args) {

    }
}
















