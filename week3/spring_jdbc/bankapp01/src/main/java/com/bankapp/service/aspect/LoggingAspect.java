package com.bankapp.service.aspect;

import com.bankapp.service.AccountServiceImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private Logger logger= LoggerFactory.getLogger(LoggingAspect.class);

    //aspect =advice + pointcut
    //@Around("execution(* com.bankapp.service.impl.*.*(..))")
//    @Around("execution( * com.bankapp.service..*Impl.*(..))")

    @Around("@annotation(Loggable)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
       long startTime=System.currentTimeMillis();

       //how to get information about the target method
        String tagetMethod=proceedingJoinPoint.getSignature().getDeclaringTypeName()
                +"."+proceedingJoinPoint.getSignature().getName();


        Object result= proceedingJoinPoint.proceed();

        long endTime=System.currentTimeMillis();
        logger.info("Time taken {} {}",(endTime-startTime), tagetMethod);
        return result;

    }
}
