package com.ryan.codebase.design.pattern.structural.decorator;

/**
 * @author Ryan
 * @version Id: MagicAttack, v 0.1 2021/6/16 下午2:35 ryan Exp $
 */
public class MagicAttack implements IAttack {

    private IAttack attack;

    public MagicAttack(IAttack attack) {
        this.attack = attack;
    }

    public void attack(int damageVal) {
        attack.attack(damageVal);
        System.out.println("magic damage " + damageVal * 0.3);
    }
}