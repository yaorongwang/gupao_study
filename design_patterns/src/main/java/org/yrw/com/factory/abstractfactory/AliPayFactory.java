package org.yrw.com.factory.abstractfactory;

public class AliPayFactory extends AbstractFactory {
    @Override
    public IPay pay() {
        return new AliPay();
    }

    @Override
    public IPayDetail payDetail() {
        return new AliPayDetail();
    }
}
