package org.yrw.com.factory.factorymethod;

import org.yrw.com.factory.factorymethod.IPay;

public class AliPay implements IPay {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
