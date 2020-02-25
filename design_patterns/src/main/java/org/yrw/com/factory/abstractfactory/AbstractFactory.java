package org.yrw.com.factory.abstractfactory;


public abstract class AbstractFactory {
    public void init(){
        System.out.println("初始化基础");
    }
    public abstract IPay pay();

    public abstract IPayDetail payDetail();
}
