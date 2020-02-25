package org.yrw.com.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        AliPayFactory aliPayFactory = new AliPayFactory();
        IPay aliPay = aliPayFactory.create();
        aliPay.pay();
        UnionPayFactory unionPayFactory = new UnionPayFactory();
        IPay unionPay = unionPayFactory.create();
        unionPay.pay();
        WeiPayFactory weiPayFactory = new WeiPayFactory();
        IPay weiPay = weiPayFactory.create();
        weiPay.pay();
        IPhonePayFactory IPhonePayFactory = new IPhonePayFactory();
        IPay iphonePay = IPhonePayFactory.create();
        iphonePay.pay();
    }
}
