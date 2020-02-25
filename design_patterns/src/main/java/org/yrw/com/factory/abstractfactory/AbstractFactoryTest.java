package org.yrw.com.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
       new AliPayFactory().pay().pay();
       new AliPayFactory().payDetail().getDetail();
       new WeiPayFactory().pay().pay();
       new WeiPayFactory().payDetail().getDetail();
       new UnionPayFactory().pay().pay();
       new UnionPayFactory().payDetail().getDetail();
       new IPhonePayFactory().pay().pay();
       new IPhonePayFactory().payDetail().getDetail();
    }
}
