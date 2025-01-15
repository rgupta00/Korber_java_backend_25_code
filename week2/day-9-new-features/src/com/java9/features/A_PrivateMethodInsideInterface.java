package com.java9.features;
//private method inside an interface
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
















