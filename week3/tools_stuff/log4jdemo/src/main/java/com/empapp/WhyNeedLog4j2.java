package com.empapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhyNeedLog4j2 {
    //Vehical v=new Car()
    private static Logger logger= LoggerFactory.getLogger(WhyNeedLog4j2.class);
    public static void main(String[] args) {
        System.out.println("code is working till line no 10");
        logger.info("code is working till line no 11");

        try{
            String info="123A";
            Integer val=Integer.parseInt(info);
        }catch (Exception e){
            logger.error(e.getMessage());
        }



        logger.info("code is working till line no 16");



        logger.info("code is working till line no 20");
    }
}