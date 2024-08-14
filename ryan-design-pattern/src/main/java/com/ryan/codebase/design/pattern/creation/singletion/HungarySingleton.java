package com.ryan.codebase.design.pattern.creation.singletion;

/**
 * 饿汉式
 *
 * @author Ryan
 * @version Id: HungarySingleton, v 0.1 2021/2/20 下午3:14 ryan Exp $
 */
public class HungarySingleton {
    private static final HungarySingleton instance = new HungarySingleton();

    private HungarySingleton() {}

    public static HungarySingleton getInstance() {
        return instance;
    }

}