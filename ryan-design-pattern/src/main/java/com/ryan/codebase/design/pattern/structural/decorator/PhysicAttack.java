package com.ryan.codebase.design.pattern.structural.decorator;

/**
 * @author Ryan
 * @version Id: PhysicAttack, v 0.1 2021/6/16 下午2:39 ryan Exp $
 */
public class PhysicAttack implements IAttack {
    private IAttack attack;

    public PhysicAttack(IAttack attack) {
        this.attack = attack;
    }

    public void attack(int damageVal) {
        attack.attack(damageVal);
        System.out.println("physic damage " + damageVal * 0.2);
    }
}