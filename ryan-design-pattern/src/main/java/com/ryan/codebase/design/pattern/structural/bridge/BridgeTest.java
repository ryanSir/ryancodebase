package com.ryan.codebase.design.pattern.structural.bridge;


import com.ryan.codebase.design.pattern.structural.bridge.impl.MailMessage;
import com.ryan.codebase.design.pattern.structural.bridge.impl.QQMessage;

/**
 * @author Ryan
 * @version Id: BridgeTest, v 0.1 2021/6/16 下午2:15 ryan Exp $
 */
public class BridgeTest {

    public static void main(String[] args) {
        IMessage mailMessage = new MailMessage();
        MessageBridge bridge = new MessageBridge(mailMessage);
        bridge.sendMessage("hello world from mail");

        IMessage qqMessage = new QQMessage();
        bridge = new MessageBridge(qqMessage);
        bridge.sendMessage("hello world from qq");
    }
}