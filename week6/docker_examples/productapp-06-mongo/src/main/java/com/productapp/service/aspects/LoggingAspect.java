package com.productapp.service.aspects;

import com.productapp.service.ProductServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect //aspect = advice + pointcut
public class LoggingAspect {
    private Logger logger= LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution( * com.productapp.service.*Impl.*(..))")
    public void applyLogging(JoinPoint joinPoint){
        logger.info("add product method is called {}",joinPoint.getSignature().getName());
    }
}

//@Pointcut("execution( * com.productapp.service.*Impl.*(..))")
//public void foo(){}
//
//@Before("foo()")
//public void applyLogging(JoinPoint joinPoint){
//    logger.info("add product method is called {}",joinPoint.getSignature().getName());
//}