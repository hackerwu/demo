package com.wxl.demo.proxy;

public class Child implements IChild {
    @Override
    public void eat() {
        System.out.println("孩子吃饭了");
    }
}
