package org.yrw.com.factory.abstractfactory;

public class IPhonePay implements IPay {
    @Override
    public void pay() {
        System.out.println("IPhone支付");
    }
}
