package com.ryan.codebase.design.pattern.action.chain;

/**
 * @author ryan
 * @version Id: Handler, v 0.1 2022/1/10 4:32 PM ryan Exp $
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
