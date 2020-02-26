package com.jsen.diy; /*
 *@author Jsen
 *@description
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationCut {

    @Before(value = "execution(* com.jsen.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("在你前面执行");
    }

    @After(value = "execution(* com.jsen.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("后面执行");

    }
    @Around("execution(* com.jsen.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("asdasd");
        Signature signature = joinPoint.getSignature();
        System.out.println(signature);
        Object proceed = joinPoint.proceed();
        System.out.println("22222222asdasd");

    }
}
