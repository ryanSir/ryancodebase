package com.ryan.codebase.design.pattern.action.statemachine;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ryan
 * @version Id: MarioStateMachine, v 0.1 2022/1/15 9:45 AM ryan Exp $
 */
@Getter
@Setter
public class MarioStateMachine {
    private int    score;
    private IMario currentState;
    public MarioStateMachine() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }
    public void obtainMushRoom() {
        this.currentState.obtainMushRoom();
    }
    public void obtainCape() {
        this.currentState.obtainCape();
    }
    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }
    public void meetMonster() {
        this.currentState.meetMonster();
    }
    public State getCurrentState() {
        return this.currentState.getName();
    }
    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
