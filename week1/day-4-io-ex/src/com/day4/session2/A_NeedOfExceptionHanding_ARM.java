package com.day4.session2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExceptionHanding_ARM {
    public static void main(String[] args) {
        //java 7: ARM "automcatic resouce management"
        //try with resouces

        try(Scanner scanner=new Scanner(System.in)) {
            System.out.println("PE numerator");
            int x = scanner.nextInt();

            System.out.println("PE Denominator");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("divide by zero");
        }catch (InputMismatchException e){
            System.out.println("pls enter ints only");
        }
        System.out.println("done");
    }
}
