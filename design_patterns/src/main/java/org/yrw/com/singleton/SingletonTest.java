package org.yrw.com.singleton;

import org.yrw.com.singleton.hungrysingleton.HungrySingleton;
import org.yrw.com.singleton.hungrysingleton.HungryStaticSingleton;
import org.yrw.com.singleton.register.ContainerSingleton;

public class SingletonTest {
    public static void main(String[] args) {
        //饿汉模式 类加载是就好创建 内存浪费  不能避免反射机制
        //HungrySingleton instance1 = HungrySingleton.getInstance();
        //HungrySingleton instance2 = HungrySingleton.getInstance();
        //System.out.println(instance1==instance2);
        //HungryStaticSingleton instance3 = HungryStaticSingleton.getInstance();
        //HungryStaticSingleton instance4 = HungryStaticSingleton.getInstance();
        //System.out.println(instance3==instance4);
        //懒汉模式 简单的懒汉模式存在性能及线程安全问题 doublecheck模式可以解决线程安全问题单无法避免反射
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
  /*      Object instance1 = ContainerSingleton.getInstance("org.yrw.com.singleton.Pojo");
        Object instance2 = ContainerSingleton.getInstance("org.yrw.com.singleton.Pojo");
        System.out.println(instance1==instance2);*/

    }

}
