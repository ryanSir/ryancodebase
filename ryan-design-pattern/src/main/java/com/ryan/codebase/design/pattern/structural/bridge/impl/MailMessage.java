package com.ryan.codebase.design.pattern.structural.bridge.impl;


import com.ryan.codebase.design.pattern.structural.bridge.IMessage;

/**
 * @author Ryan
 * @version Id: MailMessage, v 0.1 2021/6/16 下午2:09 ryan Exp $
 */
public class MailMessage implements IMessage {

    public void send(String message) {
        System.out.println("邮件消息：" + message);
    }
}