package com.wxl.designmodel.factorymodel;

public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
