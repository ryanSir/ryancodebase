package com.ryan.codebase.design.pattern.action.statemachine;

/**
 * @author ryan
 * @version Id: IMario, v 0.1 2022/1/15 9:43 AM ryan Exp $
 */
public interface IMario {

    State getName();

    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
