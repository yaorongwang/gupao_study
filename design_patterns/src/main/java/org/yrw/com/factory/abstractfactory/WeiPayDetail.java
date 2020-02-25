package org.yrw.com.factory.abstractfactory;

public class WeiPayDetail implements IPayDetail {
    @Override
    public void getDetail() {
        System.out.println("微信支付：支付详情");
    }
}
