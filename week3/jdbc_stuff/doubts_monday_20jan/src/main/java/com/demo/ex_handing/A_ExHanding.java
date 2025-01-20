package com.demo.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_ExHanding {
    public static void main(String[] args) {
        //robustness
        //try catch throw throws finally
        //Scanner scanner: gpp close the resorces?
        //ARM
//        Scanner scanner=null;
//       try{
//            scanner=new Scanner(System.in);
//           System.out.println("PE a value");
//           int num=scanner.nextInt();
//           System.out.println("PE b value");
//           int dun=scanner.nextInt();
//           int result=num/dun;
//           System.out.println(result);
//       }catch (ArithmeticException e){
//           System.out.println(e.getMessage());
//       }catch (InputMismatchException e){
//           System.out.println("input must be int");
//       }finally {
//           if(scanner!=null){
//               scanner.close();
//           }
//       }


        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("PE a value");
            int num=scanner.nextInt();
            System.out.println("PE b value");
            int dun=scanner.nextInt();
            int result=num/dun;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("input must be int");
        }
        System.out.println("done");
    }
}
