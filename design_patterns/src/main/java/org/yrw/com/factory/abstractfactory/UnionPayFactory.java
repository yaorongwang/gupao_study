package org.yrw.com.factory.abstractfactory;

public class UnionPayFactory extends AbstractFactory {
    @Override
    public IPay pay() {
        return new UnionPay();
    }

    @Override
    public IPayDetail payDetail() {
        return new UnionPayDetail();
    }
}
