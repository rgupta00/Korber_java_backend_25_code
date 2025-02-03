package com.bankapp.service.aspect;

import com.bankapp.exceptions.BankAccountNotFoundException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Aspect
public class BankAccNotFoundAspect {
    private Logger logger=org.slf4j.LoggerFactory.getLogger(BankAccNotFoundAspect.class);

    @AfterThrowing(pointcut = "execution( * com.bankapp.service.*Impl.*(..))", throwing = "ex")
    public void bankAccNotFoundAspect(BankAccountNotFoundException ex){
        System.out.println("****************************************************");
        logger.error(ex.getMessage());
        System.out.println("****************************************************");
    }
}
