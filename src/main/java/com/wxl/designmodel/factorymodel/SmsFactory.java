package com.wxl.designmodel.factorymodel;

public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
