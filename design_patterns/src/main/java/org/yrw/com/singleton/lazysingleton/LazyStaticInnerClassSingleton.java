package org.yrw.com.singleton.lazysingleton;

/*
  ClassPath : LazyStaticInnerClassSingleton.class
              LazyStaticInnerClassSingleton$LazyHolder.class
   优点：写法优雅，利用了Java本身语法特点，性能高，避免了内存浪费,不能被反射破坏
   缺点：不优雅
 */

public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        //防止反射
        if(LazyHolder.lazyStaticInnerClassSingleton!=null){
            throw new RuntimeException("不允许非法创建");
        }
    }
    public static class LazyHolder{
        //final字段表示不能更改字段
        private static final LazyStaticInnerClassSingleton lazyStaticInnerClassSingleton=new LazyStaticInnerClassSingleton();
    }
    public static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.lazyStaticInnerClassSingleton;
    }
}
