package com.java9.features;
//private method inside an interface

//interface Foo{
//    void foo1();
//
//    default void fooX(){
//        myMethod();
//    }
//    default void fooY(){
//        myMethod();
//    }
//    private void myMethod(){
//        System.out.println("common code");
//    }
//    static  void foo2(){
//
//    }
//}
//interface Foof{
//}
 interface Java8DBLogging {
    default void logInfo(String message) {
       logHelper(message, "Info");
    }

    default void logWarn(String message) {
       logHelper(message, "Warn");
    }

    default void logError(String message) {
       logHelper(message, "Error");
    }

    private void logHelper(String message, String logLevel){
        System.out.println("Step1: Connect to DataBase");
        System.out.println("Setp2: Log "+ logLevel +" message "+ message);
        System.out.println("Setp3: Close the DataBase connection");
    }

}
class Java8DBLoggingImpl implements Java8DBLogging{

}
public class A_PrivateMethodInsideInterface {
    public static void main(String[] args) {
        Java8DBLogging java8DBLogging=new Java8DBLoggingImpl();
        java8DBLogging.logError("db conn is not established");
    }
}
















