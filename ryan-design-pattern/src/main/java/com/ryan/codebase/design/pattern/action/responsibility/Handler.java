package com.ryan.codebase.design.pattern.action.responsibility;

/**
 * @author Ryan
 * @version Id: Handler, v 0.1 2021/9/17 下午4:06 ryan Exp $
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}