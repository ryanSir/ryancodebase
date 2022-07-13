package com.ryan.codebase.design.pattern.action.statemachine;

/**
 * @author ryan
 * @version Id: SuperMario, v 0.1 2022/1/15 10:19 AM ryan Exp $
 */
public class SuperMario implements IMario {
    private MarioStateMachine stateMachine;
    public SuperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }
    @Override
    public State getName() {
        return State.SUPER;
    }
    @Override
    public void obtainMushRoom() {

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
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
