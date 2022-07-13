package com.ryan.codebase.design.pattern.action.observable;

/**
 * @author ryan
 * @version Id: Boss, v 0.1 2021/12/30 10:33 PM ryan Exp $
 */
public class Boss  extends EventMechanism{

    public void attack(String bossSkill){
        System.out.println("Boss 技能释放");
        fire(bossSkill);
    }
}
