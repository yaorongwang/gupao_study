package org.yrw.com.factory.abstractfactory;

public class AliPayDetail implements IPayDetail {
    @Override
    public void getDetail() {
        System.out.println("支付宝：支付详情");
    }
}
