package org.yrw.com.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        PayFactory payFactory=new PayFactory();
        payFactory.createPay(WeiPay.class).pay();
        payFactory.createPay(AliPay.class).pay();
        payFactory.createPay(UnionPay.class).pay();
        payFactory.createPay(IPhonePay.class).pay();
    }
}
