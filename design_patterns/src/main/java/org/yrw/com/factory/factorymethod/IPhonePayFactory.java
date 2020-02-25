package org.yrw.com.factory.factorymethod;

public class IPhonePayFactory implements IPayFactory {

    public IPay create() {
        return new IPhonePay();
    }
}
