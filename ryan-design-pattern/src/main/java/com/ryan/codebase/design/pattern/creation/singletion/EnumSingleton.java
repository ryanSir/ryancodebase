package com.ryan.codebase.design.pattern.creation.singletion;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举实现
 *
 * @author Ryan
 * @version Id: IdGenerator, v 0.1 2020/11/18 下午5:02 ryan Exp $
 */
public enum EnumSingleton {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);
    public long getId(){
        return id.incrementAndGet();
    }
}