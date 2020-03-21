package org.yrw.com.singleton.lazysingleton;

/**
 * 优点：节省了内存
 * 缺点：性能低,线程安全
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
            return lazySingleton;
        }
        return lazySingleton;
    }
}
