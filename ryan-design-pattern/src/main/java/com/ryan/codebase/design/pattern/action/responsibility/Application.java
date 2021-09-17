package com.ryan.codebase.design.pattern.action.responsibility;

/**
 * @author Ryan
 * @version Id: Application, v 0.1 2021/9/17 下午4:14 ryan Exp $
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}