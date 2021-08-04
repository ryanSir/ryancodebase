package com.ryan.codebase.design.pattern.structural.bridge.impl;


import com.ryan.codebase.design.pattern.structural.bridge.IMessage;

/**
 * @author Ryan
 * @version Id: QQMessage, v 0.1 2021/6/16 下午2:12 ryan Exp $
 */
public class QQMessage implements IMessage {

    public void send(String message) {
        System.out.println("QQ消息：" + message);
    }
}