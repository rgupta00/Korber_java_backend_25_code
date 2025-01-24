package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//Aspect=Advice + pointcut*

@Component

@Aspect// advice + pointcut
public class AudienceAspect {

    //Around : to can decide wheter target method would be called or
    //sec, tx mgt


    @Around("execution(public String doMagic())")
    public Object clapping(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("before calling target method");
       Object result= joinPoint.proceed();
        System.out.println("after calling target method");
        return result;
    }



//    @AfterThrowing(value = "execution(public void doMagic())",
//            throwing = "ex")
//
//    public void clapping(Exception ex){
//        System.out.println(ex.getMessage());
//    }


//    @AfterReturning("execution(public void doMagic())")
//    public void clapping(){
//        System.out.println("clapping...maza aa gaya");
//    }

}
