package com.ryan.codebase.design.pattern.creation.singletion;

/**
 * 懒汉式
 * @author Ryan
 * @version Id: HungrySingleton, v 0.1 2020/11/18 下午5:10 ryan Exp $
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}