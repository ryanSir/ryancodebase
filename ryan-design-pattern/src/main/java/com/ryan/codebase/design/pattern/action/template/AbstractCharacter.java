package com.ryan.codebase.design.pattern.action.template;

/**
 * @author ryan
 * @version Id: AbstractCharacter, v 0.1 2021/12/30 10:07 PM ryan Exp $
 */
public abstract class AbstractCharacter implements Character {

    @Override
    public void dead() {
        // 判断血量
        if (!isBloodEmpty()) {
            return;
        }
        // 播放死亡音效
        playDeadVoice();

        // 播放死亡动画
        playDeadAnimation();

        // 弹出复活界面
        promoteRestartWindow();

    }

    protected abstract void playDeadVoice();

    protected abstract void playDeadAnimation();

    private boolean isBloodEmpty() {
        System.out.println("血槽空了。。。");
        return true;
    }

    protected void promoteRestartWindow(){
        System.out.println("弹出复活界面...");
    }
}
