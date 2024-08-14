package com.ryan.codebase.design.pattern.structural.bridge;

/**
 * @author Ryan
 * @version Id: AbstractMessageBridge, v 0.1 2021/6/16 下午2:13 ryan Exp $
 */
public abstract class AbstractMessageBridge {

    protected IMessage message;

    public AbstractMessageBridge(IMessage message) {
        this.message = message;
    }

    public void sendMessage(String msg) {
        message.send(msg);
    }
}