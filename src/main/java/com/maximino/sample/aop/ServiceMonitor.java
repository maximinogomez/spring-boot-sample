package com.maximino.sample.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {

    private static final Log LOG = LogFactory.getLog(ServiceMonitor.class);

    @AfterReturning("execution(* com..*Service.*(..))")
    public void logServiceAccess(final JoinPoint joinPoint) {
        LOG.info("Completed : " + joinPoint);
        System.out.println(" =====> ");
    }
}
