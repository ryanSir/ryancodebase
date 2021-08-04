package com.ryan.codebase.design.pattern.structural.decorator;

/**
 * @author Ryan
 * @version Id: BaseAttack, v 0.1 2021/6/16 下午2:41 ryan Exp $
 */
public class BaseAttack implements IAttack {

    public void attack(int damageVal) {
        System.out.println("Base damage " + damageVal);
    }
}