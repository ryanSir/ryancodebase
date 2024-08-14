package com.ryan.codebase.design.pattern.action.observable;

/**
 * @author ryan
 * @version Id: Team, v 0.1 2021/12/30 10:31 PM ryan Exp $
 */
public class SuperTeam implements Watcher{

    @Override
    public void onEvent(String event) {
        if ("佛怒唐莲".equals(event)){
            System.out.println("佛怒唐莲，敌人团灭...");
            return;
        }
        // nothing todo
    }
}
