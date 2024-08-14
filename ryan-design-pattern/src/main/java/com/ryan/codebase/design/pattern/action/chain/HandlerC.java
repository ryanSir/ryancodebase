package com.ryan.codebase.design.pattern.action.chain;

/**
 * @author ryan
 * @version Id: HandlerA, v 0.1 2022/1/10 4:33 PM ryan Exp $
 */
public class HandlerC extends Handler {

    @Override
    public void handle() {
        boolean handled = true;
        System.out.println("C can not do this request,end");
        if (!handled && successor != null) {
            successor.handle();
        }

    }
}
