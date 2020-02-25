package org.yrw.com.factory.simplefactory;

public class IPhonePay implements IPay {
    @Override
    public void pay() {
        System.out.println("境外支付：iphonepay");
    }
}
