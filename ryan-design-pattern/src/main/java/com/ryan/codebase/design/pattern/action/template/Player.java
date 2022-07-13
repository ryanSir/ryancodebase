package com.ryan.codebase.design.pattern.action.template;

/**
 * @author ryan
 * @version Id: Player, v 0.1 2021/12/30 10:13 PM ryan Exp $
 */
public class Player extends AbstractCharacter{

    @Override
    protected void playDeadVoice() {
        System.out.println("玩家死亡音效...");
    }

    @Override
    protected void playDeadAnimation() {
        System.out.println("玩家死亡动画...");
    }
}
