package com.bankapp.service.aspect;

import com.bankapp.service.AccountServiceImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LoggingAspect {

    private Logger logger=org.slf4j.LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(com.bankapp.service.aspect.Loggable)")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start= System.currentTimeMillis();

        Object proceed = proceedingJoinPoint.proceed();


        long end=System.currentTimeMillis();
        logger.info("time taken to execute "+proceedingJoinPoint.getSignature().getName()+"  is "+(end-start)+" ms");

        return proceed;
    }
}
