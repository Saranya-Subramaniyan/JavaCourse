package com.spring.SpringMVC.LogFile;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger= LoggerFactory.getLogger(LoggingAspect.class);
    @Before("execution( public * com.spring.SpringMVC.controller.HomeController.getCoder())")
    public void log(){
//        System.out.println("get student method called");
        logger.info("get student method called");
    }
}
