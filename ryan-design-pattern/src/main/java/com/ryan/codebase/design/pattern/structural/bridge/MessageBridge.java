package com.ryan.codebase.design.pattern.structural.bridge;

/**
 * @author Ryan
 * @version Id: MessageBridge, v 0.1 2021/6/16 下午2:15 ryan Exp $
 */
public class MessageBridge extends AbstractMessageBridge {

    public MessageBridge(IMessage message) {
        super(message);
    }

    public void sendMessage(String msg) {
        // do anything you want
        super.sendMessage(msg);
    }
}