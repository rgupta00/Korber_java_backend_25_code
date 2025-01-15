package com.java9.features;

import java.util.InputMismatchException;
import java.util.Scanner;
class DoSideWork implements AutoCloseable{
    public DoSideWork(){
        System.out.println("crt of DoSideWork");
    }
    void doSideWork(){
        System.out.println("doing side work");
    }
    @Override
    public void close() throws Exception {
        System.out.println("closing side work");
    }
}
class Work implements AutoCloseable{
    public Work(){
        System.out.println("ctr of work");
    }
    void doWork(){
        System.out.println("doing main work");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close ");
    }
}
public class B_TryWIthResouceImprovement {
    public static void main(String[] args) {
//        //excetpion handing: java 7 ARM (Automatic res mgt) --> in java 9 enhacnce the syn
//        Scanner scanner=null;

        //how arm works AutoClosable

        try(Work w=new Work(); DoSideWork doSideWork=new DoSideWork()){
            w.doWork();
            doSideWork.doSideWork();
        }catch (Exception e){

        }

//       try{
//            scanner=new Scanner(System.in);//decorator
//           System.out.println("PE salary");
//           double salary=scanner.nextDouble();
//           System.out.println(salary);
//       }catch (InputMismatchException e){
//           System.out.println("pl enter double only");
//       }finally {
//           scanner.close();
//       }

        //java 7: till java 7 i have to create the resouce within the try block
        
//        try(Scanner scanner=new Scanner(System.in) ){
//            System.out.println("PE salary");
//            double salary=scanner.nextDouble();
//            System.out.println(salary);
//        }catch (InputMismatchException e){
//            System.out.println("pl enter double only");
//        }
//        
        //java 9: u can crete the resouce out the try block
//        final   Scanner scanner=new Scanner(System.in);//effactively final ?
//        try(scanner ){
//            System.out.println("PE salary");
//            double salary=scanner.nextDouble();
//            System.out.println(salary);
//        }catch (InputMismatchException e){
//            System.out.println("pl enter double only");
//        }
//
    }
}
