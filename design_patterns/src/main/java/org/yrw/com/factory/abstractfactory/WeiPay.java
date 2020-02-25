package org.yrw.com.factory.abstractfactory;

public class WeiPay implements IPay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
