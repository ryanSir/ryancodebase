package com.ryan.codebase.design.pattern.action.chain;

/**
 * @author ryan
 * @version Id: HandlerA, v 0.1 2022/1/10 4:33 PM ryan Exp $
 */
public class HandlerB extends Handler {

    @Override
    public void handle() {
        boolean handled = false;
        System.out.println("B can not do this request,to next handler");
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
