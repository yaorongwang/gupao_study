package org.yrw.com.proxy.dynamicproxy.jdkproxy;

public class Zhangsan implements IPerson{
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    @Override
    public void buyInsure() {
        System.out.println("30万");
    }
}
