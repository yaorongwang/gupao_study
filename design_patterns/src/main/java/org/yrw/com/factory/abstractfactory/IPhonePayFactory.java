package org.yrw.com.factory.abstractfactory;

public class IPhonePayFactory extends AbstractFactory {
    @Override
    public IPay pay() {
        return new IPhonePay();
    }

    @Override
    public IPayDetail payDetail() {
        return new IPhonePayDetail();
    }
}
