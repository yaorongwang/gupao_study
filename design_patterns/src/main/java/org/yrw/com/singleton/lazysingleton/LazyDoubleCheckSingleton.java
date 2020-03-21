package org.yrw.com.singleton.lazysingleton;

/**
 * 优点:性能高了，线程安全了
 * 缺点：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){}
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;
    public static LazyDoubleCheckSingleton getInstance(){
        //检查是否要阻塞
        if(lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){
                    //检查是否要重新创建实例
                    lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
                    return lazyDoubleCheckSingleton;
                    //指令重排序的问题
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
