package org.yrw.com.factory.factorymethod;

public class IPhonePay implements IPay {
    @Override
    public void pay() {
        System.out.println("境外支付：iphonePay");
    }
}
