package com.ryan.codebase.design.pattern.action.statemachine;

/**
 * @author ryan
 * @version Id: ApplicationDemo, v 0.1 2022/1/15 10:35 AM ryan Exp $
 */
public class ApplicationDemo {

    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        mario.obtainCape();
        System.out.println("mario score: " + score + "; state: " + state);
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());
        mario.obtainFireFlower();
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());

    }
}
