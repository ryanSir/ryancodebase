package com.ryan.codebase.design.pattern.action.responsibility;

/**
 * @author Ryan
 * @version Id: HandlerChain, v 0.1 2021/9/17 下午4:10 ryan Exp $
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);

        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle(){
        if (head !=null){
            head.handle();
        }
    }
}