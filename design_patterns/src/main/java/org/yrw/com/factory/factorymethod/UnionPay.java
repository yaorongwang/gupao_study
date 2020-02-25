package org.yrw.com.factory.factorymethod;

public class UnionPay implements IPay {
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
