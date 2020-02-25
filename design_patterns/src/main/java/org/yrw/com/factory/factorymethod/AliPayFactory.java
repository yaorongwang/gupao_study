package org.yrw.com.factory.factorymethod;

public class AliPayFactory implements IPayFactory {

    public IPay create() {
        return new AliPay();
    }
}
