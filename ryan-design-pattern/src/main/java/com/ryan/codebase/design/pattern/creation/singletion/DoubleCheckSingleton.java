package com.ryan.codebase.design.pattern.creation.singletion;

/**
 * 双重检测机制
 * @author Ryan
 * @version Id: DoubleCheckSingleton, v 0.1 2021/2/22 上午11:18 ryan Exp $
 */
public class DoubleCheckSingleton {

    private static  DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}