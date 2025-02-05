package com.empapp.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class PerformanceAspect {
    private static final org.slf4j.Logger logger =
            org.slf4j.LoggerFactory.getLogger(PerformanceAspect.class);
    //Aspect=advice + pointcut
    @Around("execution(* com.empapp.service.*Impl.*(..))")
    public Object calPerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
       long start=System.currentTimeMillis();
        Object value= proceedingJoinPoint.proceed();
        long end=System.currentTimeMillis();
        logger.info("time taken {} ",end-start+" method name :"+proceedingJoinPoint.getSignature().getName());
        return value;
    }
}
