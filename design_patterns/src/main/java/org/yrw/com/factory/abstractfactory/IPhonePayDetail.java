package org.yrw.com.factory.abstractfactory;

public class IPhonePayDetail implements IPayDetail {
    @Override
    public void getDetail() {
        System.out.println("IPhone支付：支付详情");
    }
}
