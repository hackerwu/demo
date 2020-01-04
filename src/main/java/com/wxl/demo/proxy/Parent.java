package com.wxl.demo.proxy;

public class Parent implements IChild {
    private IChild child;
    public Parent(IChild child){
        this.child = child;
    }
    @Override
    public void eat() {
        System.out.println("父母吃饭");
        child.eat();
        System.out.println("父母收拾残局");

    }
}
