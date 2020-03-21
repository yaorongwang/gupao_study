package org.yrw.com.singleton;

import org.yrw.com.singleton.lazysingleton.LazySingleton;
import org.yrw.com.singleton.register.ContainerSingleton;

public class ExectorThread implements Runnable {

    @Override
    public void run() {
        //LazySingleton lazySingleton=LazySingleton.getInstance();
        Object instance1 = ContainerSingleton.getInstance("org.yrw.com.singleton.Pojo");
    }
}
