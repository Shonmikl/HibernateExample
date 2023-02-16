package main.com.hiber.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* main.com.hiber.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* main.com.hiber.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAddReturnMethodsFromUnilibrary() {
    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("--> LoggingAspect : beforeGetLoggingAdvice() <--#1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("--> LoggingAspect : beforeReturnLoggingAdvice() <--#2");
    }

    @Before("allGetAddReturnMethodsFromUnilibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("--> LoggingAspect : beforeGetAndReturnLoggingAdvice() <--#3");
    }
}