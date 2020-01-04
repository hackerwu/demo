package com.wxl.demo.interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
        if(!(handler instanceof HandlerMethod)){
            System.out.println("当前操作handler不为HandlerMethod="+handler.getClass().getName()+
            request.getQueryString());
            return false;
        }
        return true;
    }
}
