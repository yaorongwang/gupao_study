package org.yrw.com.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        Object Instance = null;
        if (!ioc.containsKey(className)) {
            try {
                synchronized (ContainerSingleton.class) {
                    if (!ioc.containsKey(className)) {
                        Instance = Class.forName(className).newInstance();
                        ioc.put(className, Instance);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Instance;
        }
        Instance = ioc.get(className);
        return Instance;
    }


}
