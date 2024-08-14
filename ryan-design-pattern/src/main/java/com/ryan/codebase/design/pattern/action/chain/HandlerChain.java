package com.ryan.codebase.design.pattern.action.chain;

/**
 * @author ryan
 * @version Id: HandChain, v 0.1 2022/1/10 4:37 PM ryan Exp $
 */
public class HandlerChain {

    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler){
        handler.setSuccessor(null);
        if (head == null){
            head =  handler;
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

