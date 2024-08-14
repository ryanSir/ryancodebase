package com.ryan.codebase.design.pattern.structural.decorator;

/**
 * @author Ryan
 * @version Id: AttackTest, v 0.1 2021/6/16 下午2:42 ryan Exp $
 */
public class AttackTest {

    public static void main(String[] args) {
        IAttack attack = new BaseAttack();
        IAttack magicAttack = new MagicAttack(attack);
        IAttack phyAttack = new PhysicAttack(magicAttack);
        phyAttack.attack(1000);
    }
}