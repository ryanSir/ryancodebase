package com.ryan.codebase.design.pattern.action.statemachine;

/**
 * @author ryan
 * @version Id: SmallMario, v 0.1 2022/1/15 9:44 AM ryan Exp $
 */
public class SmallMario implements IMario {
    private MarioStateMachine stateMachine;
    public SmallMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }
    @Override
    public State getName() {
        return State.SMALL;
    }
    @Override
    public void obtainMushRoom() {
        stateMachine.setCurrentState(new SuperMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 100);
    }
    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }
    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }
    @Override
    public void meetMonster() {
    }
}
