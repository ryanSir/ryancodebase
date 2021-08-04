package com.ryan.codebase.design.pattern.creation.singletion;

/**
 * 静态内部类
 * @author Ryan
 * @version Id: StaticInnerIdGenerator, v 0.1 2020/11/18 下午5:07 ryan Exp $
 */
public class StaticInnerIdGenerator {

    private StaticInnerIdGenerator() {
    }

    public static StaticInnerIdGenerator getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticInnerIdGenerator INSTANCE = new StaticInnerIdGenerator();
    }
}