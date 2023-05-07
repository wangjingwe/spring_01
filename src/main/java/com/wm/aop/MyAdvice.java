package com.wm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Wm
 * @description
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.wm.service.impl.BookServiceImpl.save())")
    private void pt(){}

//    @Before("pt()")
//    public void method() {
//        System.out.println(System.currentTimeMillis());
//
//    }

    @Around("pt()")
    public void method(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println(signature.getDeclaringType());
        System.out.println(signature.getName());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            proceedingJoinPoint.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("times:" + (end - start));
    }
}
