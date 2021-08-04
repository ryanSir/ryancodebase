package com.ryan.codebase.design.pattern.structural.adapter;

/**
 * @author Ryan
 * @version Id: MonsterAdaptor, v 0.1 2021/6/16 下午3:53 ryan Exp $
 */
public class MonsterAdaptor extends Monster implements SupMonster {

    public void defense(String name) {
        System.out.println("monster defense" + name);
    }
}