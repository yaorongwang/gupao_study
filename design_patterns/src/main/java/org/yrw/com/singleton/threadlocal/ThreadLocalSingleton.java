package org.yrw.com.singleton.threadlocal;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}
    public static final ThreadLocal<ThreadLocalSingleton> instance=new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue(){
           return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance(){
        return instance.get();
    }
}
