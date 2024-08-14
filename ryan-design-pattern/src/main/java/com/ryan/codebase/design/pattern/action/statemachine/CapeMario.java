package com.ryan.codebase.design.pattern.action.statemachine;

/**
 * @author ryan
 * @version Id: CapeMario, v 0.1 2022/1/15 10:32 AM ryan Exp $
 */
public class CapeMario  implements IMario {
    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }
    @Override
    public State getName() {
        return State.CAPE;
    }
    @Override
    public void obtainMushRoom() {
        stateMachine.setCurrentState(new SuperMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 100);
    }
    @Override
    public void obtainCape() {
    }
    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }
    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 200);
    }
}
