package com.wxl.designmodel.factorymodel;

public class TestMain {
    public static void main(String args[]){
        Provider provider = new MailFactory();
        Sender send = provider.produce();
        send.send();
    }
}
