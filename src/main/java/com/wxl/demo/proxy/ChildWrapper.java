package com.wxl.demo.proxy;

public class ChildWrapper implements IChild {
    private Child child;
    public ChildWrapper(Child child){
        this.child = child;
    }

    @Override
    public void eat() {
        System.out.println("孩子做饭");
        child.eat();
        System.out.println("孩子收拾");
    }
}
