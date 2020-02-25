package org.yrw.com.factory.abstractfactory;

public class UnionPay implements IPay {
    @Override
    public void pay() {
        System.out.println("网银支付");
    }
}
