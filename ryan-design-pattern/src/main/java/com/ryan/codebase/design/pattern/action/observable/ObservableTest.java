package com.ryan.codebase.design.pattern.action.observable;

/**
 * @author ryan
 * @version Id: ObservableTest, v 0.1 2021/12/30 10:41 PM ryan Exp $
 */
public class ObservableTest {

    public static void main(String[] args) {
        Watcher team = new Team();
        Watcher superTeam = new SuperTeam();
        Boss boss = new Boss();
        boss.addWatcher("乱劈风卷", team);
        boss.addWatcher("佛怒唐莲", superTeam);
        boss.attack("乱劈风卷");
        System.out.println(">>>>> 敌人又来一波");
        boss.attack("佛怒唐莲");
    }
}
