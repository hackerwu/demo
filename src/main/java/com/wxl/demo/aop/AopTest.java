package com.wxl.demo.aop;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AopTest {
    @Pointcut("execution(public * com.wxl.demo.controller.*.*(..))")
    public void AopTest(){}

    @Before("AopTest()")
    public void printParam(JoinPoint joinPoint){
        Signature sig = joinPoint.getSignature();
        String method = joinPoint.getTarget().getClass().getName()+"."+sig.getName();
        Object[] args = joinPoint.getArgs();
        String params = JSONObject.toJSONString(args);
System.out.println(method+":"+params);
        log.info(method+":"+params);
    }
}
