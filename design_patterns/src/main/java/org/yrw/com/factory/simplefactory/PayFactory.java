package org.yrw.com.factory.simplefactory;

public class PayFactory{

    public IPay createPay(Class<? extends IPay> clazz) throws IllegalAccessException, InstantiationException {
        if (clazz!=null){
            return clazz.newInstance();
        }
        return null;
    }
}
