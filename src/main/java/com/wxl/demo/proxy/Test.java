package com.wxl.demo.proxy;

public class Test {
    public static void main(String args[]){
        IChild target = new Child();
        Parent parent = new Parent(target);
        parent.eat();
    }
}
