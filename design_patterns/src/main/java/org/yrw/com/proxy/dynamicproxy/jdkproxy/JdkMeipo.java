package org.yrw.com.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {
    private IPerson person;
    public IPerson getInstance(IPerson person){
        this.person =person;
        Class<?> clazz=person.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.person,args);
        after();
        return null;
    }
    private void after(){
        System.out.println("双方同意，开始交往");
    }
    private void before(){
        System.out.println("我是媒婆，收集到你的需求，开始物色");
    }
}
