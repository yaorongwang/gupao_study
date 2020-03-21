package org.yrw.com.singleton.hungrysingleton;
//改写法，纯属装逼
public class HungryStaticSingleton {
    private static  HungryStaticSingleton hungryStaticSingleton;
    //先静态后动态
    //先上，后下
    //先属性后方法
    private HungryStaticSingleton(){}
    static {
        hungryStaticSingleton=new HungryStaticSingleton();
    }
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
