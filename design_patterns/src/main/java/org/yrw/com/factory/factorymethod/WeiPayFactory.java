package org.yrw.com.factory.factorymethod;

public class WeiPayFactory implements IPayFactory {

    public IPay create() {
        return new WeiPay();
    }
}
