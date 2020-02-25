package org.yrw.com.factory.simplefactory;

public class WeiPay implements IPay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
