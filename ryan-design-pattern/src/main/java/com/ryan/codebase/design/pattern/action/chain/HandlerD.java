package com.ryan.codebase.design.pattern.action.chain;

/**
 * @author ryan
 * @version Id: HandlerD, v 0.1 2022/1/10 4:44 PM ryan Exp $
 */
public class HandlerD extends Handler {

    @Override
    public void handle() {
        boolean handled = false;
        System.out.println("D can not do this request,to next handler");
        if (!handled && successor != null) {
            successor.handle();
        }

    }
}
