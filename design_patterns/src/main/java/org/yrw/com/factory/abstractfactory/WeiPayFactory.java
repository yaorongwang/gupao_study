package org.yrw.com.factory.abstractfactory;

public class WeiPayFactory extends AbstractFactory {
    @Override
    public IPay pay() {
        return new WeiPay();
    }

    @Override
    public IPayDetail payDetail() {
        return new WeiPayDetail();
    }
}
