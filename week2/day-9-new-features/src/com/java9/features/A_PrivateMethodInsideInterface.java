package com.java9.features;
//interface Foof{
//    void foo();
//    default void foof(){
//
//    }
//    static  void foof2(){
//
//    }
//    private void fooPrivate(){
//        System.out.println("used to cater the common code of default methods DRY");
//    }
//}
interface MyLogging{
    default void logInfo(String message){
        log(message,"INFO");
    }
    default void logWarn(String message){
        log(message,"WARN");
    }
    private void log(String message, String  levelLog){
        System.out.println("step 1: connection to db");
        System.out.println("step2: log the message  to level "+levelLog);
        System.out.println("step 3 close the conn");
    }
}
class MyLoggingImp implements MyLogging{

}
public class A_PrivateMethodInsideInterface {
    public static void main(String[] args) {

        MyLogging myLogging=new MyLoggingImp();
        myLogging.logWarn("some jdbc code");
    }
}
















