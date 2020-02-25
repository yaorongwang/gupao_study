package org.yrw.com.factory.abstractfactory;

public class UnionPayDetail implements IPayDetail {
    @Override
    public void getDetail() {
        System.out.println("网银支付：支付详情");
    }
}
