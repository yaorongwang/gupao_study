package org.yrw.com.factory.factorymethod;

public class UnionPayFactory implements IPayFactory {

    public IPay create() {
        return new UnionPay();
    }
}
