package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//Aspect=Advice + pointcut*

@Component

@Aspect
public class AudienceAspect {


    @Before("execution(public void doMagic())")
    public void clapping(){
        System.out.println("clapping...maza aa gaya");
    }

    //After
//    @AfterThrowing(value = "execution(public void doMagic())",
//                    throwing = "ex")
//    public void clapping(Exception ex){
//        System.out.println(ex.getMessage());
//    }


//    @Around("execution(public String doMagic())")
//    public String clapping(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("before doMagic is called");
//        Object result=null;
//        try{
//            result = proceedingJoinPoint.proceed();
//        }catch (Throwable throwable){
//            System.out.println(throwable.getMessage());
//        }
//        System.out.println("after doMagic is called");
//        return (String) result;
//    }



//    @Pointcut("execution(public void doMagic())")
//    public void foo(){}
//
//    @After("foo()")
//    public void clapping(){
//        System.out.println("clapping...maza aa gaya");
//    }
}
