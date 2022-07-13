package com.ryan.codebase.design.pattern.action.template;

/**
 * @author ryan
 * @version Id: NPC, v 0.1 2021/12/30 10:11 PM ryan Exp $
 */
public class NPC extends AbstractCharacter{

    @Override
    protected void playDeadVoice() {
        System.out.println("NPC死亡音效...");
    }

    @Override
    protected void playDeadAnimation() {
        System.out.println("NPC死亡动画...");
    }

    @Override
    protected void promoteRestartWindow() {
        // NPC死亡，该功能不触发
    }
}
